package com.project.farmsmart.service;

import com.project.farmsmart.entities.ProductCategory;
import com.project.farmsmart.entities.ProductType;

import java.util.List;

public interface ProductCategoryService {
    ProductCategory saveProductCategory(ProductCategory productCategory);
    ProductCategory getProductCategory(Long id);
    List<ProductCategory> getAllProductCategories();
    ProductCategory updateProductCategory(ProductCategory productCategory);
    void deleteProductCategoryById(Long id);
    void setProductType(ProductCategory productCategory, Long id);
}
