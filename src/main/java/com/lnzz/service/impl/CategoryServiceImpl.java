package com.lnzz.service.impl;

import com.lnzz.consts.MallConst;
import com.lnzz.dao.CategoryMapper;
import com.lnzz.pojo.Category;
import com.lnzz.service.CategoryService;
import com.lnzz.vo.CategoryVo;
import com.lnzz.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ClassName：CategoryServiceImpl
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 14:24
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResponseVo<List<CategoryVo>> selectAll() {
        List<Category> categories = categoryMapper.selectAll();
        //查出parent_id=0
        List<CategoryVo> categoryVoList = categories.stream()
                .filter(e -> e.getParentId().equals(MallConst.ROOT_PARENT_ID))
                .map(this::categoryCategoryVo)
                .sorted(Comparator.comparing(CategoryVo::getSortOrder).reversed())
                .collect(Collectors.toList());
        //查询子目录
        findSubCategory(categoryVoList, categories);
        return ResponseVo.success(categoryVoList);
    }

    @Override
    public void findSubCategoryId(Integer id, Set<Integer> resultSet) {
        List<Category> categories = categoryMapper.selectAll();
        findSubCategoryId(id, resultSet, categories);
    }

    private void findSubCategoryId(Integer id, Set<Integer> resultSet, List<Category> categories) {
        for (Category category : categories) {
            if (category.getParentId().equals(id)) {
                //子目录
                resultSet.add(category.getId());
                findSubCategoryId(category.getId(), resultSet);
            }
        }
    }

    /**
     * 查询子目录
     *
     * @param categoryVoList
     * @param categories
     */
    private void findSubCategory(List<CategoryVo> categoryVoList, List<Category> categories) {
        for (CategoryVo categoryVo : categoryVoList) {
            List<CategoryVo> subCategoryVoList = new ArrayList<>();
            for (Category category : categories) {
                if (categoryVo.getId().equals(category.getParentId())) {
                    //如果查到内容，设置subCategory，继续往下查询
                    CategoryVo subCategoryVo = categoryCategoryVo(category);
                    subCategoryVoList.add(subCategoryVo);
                }
                //排序
                subCategoryVoList.sort(Comparator.comparing(CategoryVo::getSortOrder).reversed());

                categoryVo.setSubCategories(subCategoryVoList);
                //递归查询子目录
                findSubCategory(subCategoryVoList, categories);
            }
        }

    }

    private CategoryVo categoryCategoryVo(Category category) {
        CategoryVo categoryVo = new CategoryVo();
        BeanUtils.copyProperties(category, categoryVo);
        return categoryVo;
    }
}
