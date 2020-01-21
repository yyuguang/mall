package com.lnzz.controller;

import com.lnzz.pojo.Category;
import com.lnzz.service.CategoryService;
import com.lnzz.vo.CategoryVo;
import com.lnzz.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName：CategoryController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 14:40
 * @Description:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseVo<List<CategoryVo>> selectAll() {
        return categoryService.selectAll();
    }
}
