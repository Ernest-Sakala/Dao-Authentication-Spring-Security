package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.Buyer;
import com.project.farmsmart.entities.BuyerType;
import com.project.farmsmart.repository.BuyerRepository;
import com.project.farmsmart.repository.BuyerTypeRepository;
import com.project.farmsmart.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    @Autowired
    private BuyerTypeRepository buyerTypeRepository;

    public BuyerServiceImpl(BuyerRepository buyerRepository, BuyerTypeRepository buyerTypeRepository) {
        this.buyerRepository = buyerRepository;
        this.buyerTypeRepository = buyerTypeRepository;
    }

    @Override
    public Buyer saveBuyer(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public Buyer getBuyer(Long id) {
        return buyerRepository.findById(id).get();
    }

    @Override
    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }

    @Override
    public Buyer updateBuyer(Buyer buyer) {
        return buyerRepository.save(buyer);
    }

    @Override
    public void deleteBuyerById(Long id) {
        buyerRepository.deleteById(id);
    }

    @Override
    public void setBuyerType(Buyer buyer, Long id) {
        BuyerType buyerType = buyerTypeRepository.findById(id).get();
        buyer.setBuyerType(buyerType);
    }
}
