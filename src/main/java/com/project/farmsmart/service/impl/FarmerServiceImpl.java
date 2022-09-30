package com.project.farmsmart.service.impl;

import com.project.farmsmart.entities.Farmer;
import com.project.farmsmart.repository.FarmerRepository;
import com.project.farmsmart.repository.UserRepository;
import com.project.farmsmart.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FarmerServiceImpl implements FarmerService {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Bean
    public FarmerRepository getFarmerRepository() {
        return farmerRepository;
    }
    @Autowired
    private FarmerRepository farmerRepository;

    public FarmerServiceImpl(UserRepository userRepository, FarmerRepository farmerRepository) {
        this.userRepository = userRepository;
        this.farmerRepository = farmerRepository;
    }


    @Override
    public Farmer saveFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public Farmer getFarmer(Long id) {
        return farmerRepository.findById(id).get();
    }

    @Override
    public List<Farmer> getAllFarmers() {
        return farmerRepository.findAll();
    }

    @Override
    public Farmer updateFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    @Override
    public void deleteFarmerById(Long id) {
        farmerRepository.deleteById(id);
    }
}
