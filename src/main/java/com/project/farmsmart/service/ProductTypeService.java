package com.project.farmsmart.service;

import com.project.farmsmart.entities.ProductType;

import java.util.List;

public interface ProductTypeService {
    ProductType saveProductType(ProductType productType);
    ProductType getProductType(Long id);
    List<ProductType> getAllProductTypes();
    ProductType updateProductType(ProductType productType);
    void deleteProductTypeById(Long id);
}
