package com.project.farmsmart.service;

import com.project.farmsmart.entities.Farmer;
import com.project.farmsmart.entities.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface FarmerService {
    Farmer saveFarmer(Farmer farmer);
    Farmer getFarmer(Long id);
    List<Farmer> getAllFarmers();
    Farmer updateFarmer(Farmer farmer);
    void deleteFarmerById(Long id);
}
