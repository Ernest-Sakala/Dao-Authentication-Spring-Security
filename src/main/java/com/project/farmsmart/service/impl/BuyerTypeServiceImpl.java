package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.BuyerType;
import com.project.farmsmart.repository.BuyerTypeRepository;
import com.project.farmsmart.service.BuyerTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BuyerTypeServiceImpl implements BuyerTypeService {

    @Autowired
    private BuyerTypeRepository buyerTypeRepository;

    public BuyerTypeServiceImpl(BuyerTypeRepository buyerTypeRepository) {
        this.buyerTypeRepository = buyerTypeRepository;
    }


    @Override
    public BuyerType saveBuyerType(BuyerType buyerType) {
        return buyerTypeRepository.save(buyerType);
    }

    @Override
    public BuyerType getBuyerType(Long id) {
        return buyerTypeRepository.findById(id).get();
    }

    @Override
    public List<BuyerType> getAllBuyerTypes() {
        return buyerTypeRepository.findAll();
    }

    @Override
    public BuyerType updateBuyerType(BuyerType buyerType) {
        return buyerTypeRepository.save(buyerType);
    }

    @Override
    public void deleteBuyerTypeById(Long id) {
        buyerTypeRepository.deleteById(id);
    }
}
