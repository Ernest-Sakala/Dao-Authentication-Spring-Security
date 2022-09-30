package com.project.farmsmart.service;

import com.project.farmsmart.entities.Buyer;

import java.util.List;

public interface BuyerService {
    Buyer saveBuyer(Buyer buyer);
    Buyer getBuyer(Long id);
    List<Buyer> getAllBuyers();
    Buyer updateBuyer(Buyer buyer);
    void deleteBuyerById(Long id);
    void setBuyerType(Buyer buyer, Long id);
}
