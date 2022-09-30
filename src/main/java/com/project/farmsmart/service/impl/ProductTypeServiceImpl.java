package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.ProductType;
import com.project.farmsmart.repository.ProductTypeRepository;
import com.project.farmsmart.repository.FarmerRepository;
import com.project.farmsmart.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductTypeServiceImpl implements ProductTypeService {

    @Autowired
    private FarmerRepository farmerRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    public ProductTypeServiceImpl(FarmerRepository farmerRepository, ProductTypeRepository productTypeRepository) {
        this.farmerRepository = farmerRepository;
        this.productTypeRepository = productTypeRepository;
    }


    @Override
    public ProductType saveProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public ProductType getProductType(Long id) {
        return productTypeRepository.findById(id).get();
    }

    @Override
    public List<ProductType> getAllProductTypes() {
        return productTypeRepository.findAll();
    }

    @Override
    public ProductType updateProductType(ProductType productType) {
        return productTypeRepository.save(productType);
    }

    @Override
    public void deleteProductTypeById(Long id) {
        productTypeRepository.deleteById(id);
    }
}
