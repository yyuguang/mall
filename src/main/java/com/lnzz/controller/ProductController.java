package com.lnzz.controller;

import com.github.pagehelper.PageInfo;
import com.lnzz.service.ProductService;
import com.lnzz.vo.ProductDetailVo;
import com.lnzz.vo.ProductVo;
import com.lnzz.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName：ProductController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/21 15:58
 * @Description:
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseVo<PageInfo> list(@RequestParam(required = false) Integer categoryId,
                                     @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                     @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return productService.list(categoryId, pageNum, pageSize);

    }

    @GetMapping("/products/{productId}")
    public ResponseVo<ProductDetailVo> detail(@PathVariable Integer productId) {
        return productService.detail(productId);

    }
}
