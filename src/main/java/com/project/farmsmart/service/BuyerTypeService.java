package com.project.farmsmart.service;

import com.project.farmsmart.entities.BuyerType;

import java.util.List;

public interface BuyerTypeService {
    BuyerType saveBuyerType(BuyerType buyerType);
    BuyerType getBuyerType(Long id);
    List<BuyerType> getAllBuyerTypes();
    BuyerType updateBuyerType(BuyerType buyerType);
    void deleteBuyerTypeById(Long id);
}
