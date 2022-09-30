package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.ProductCategory;
import com.project.farmsmart.entities.ProductType;
import com.project.farmsmart.repository.ProductCategoryRepository;
import com.project.farmsmart.repository.ProductTypeRepository;
import com.project.farmsmart.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    public ProductCategoryServiceImpl(ProductCategoryRepository productCategoryRepository, ProductTypeRepository productTypeRepository) {
        this.productCategoryRepository = productCategoryRepository;
        this.productTypeRepository = productTypeRepository;
    }


    @Override
    public ProductCategory saveProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public ProductCategory getProductCategory(Long id) {
        return productCategoryRepository.findById(id).get();
    }

    @Override
    public List<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory updateProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public void deleteProductCategoryById(Long id) {
        productCategoryRepository.deleteById(id);
    }

    @Override
    public void setProductType(ProductCategory productCategory, Long id) {
        ProductType productType = productTypeRepository.findById(id).get();
        productCategory.setProductType(productType);
    }
}
