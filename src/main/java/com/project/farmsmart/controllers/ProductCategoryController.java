package com.project.farmsmart.controllers;

import com.project.farmsmart.service.ProductCategoryService;
import org.springframework.stereotype.Controller;

@Controller
public class ProductCategoryController {
    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

}
