package com.project.farmsmart.controllers;

import com.project.farmsmart.entities.Farmer;
import com.project.farmsmart.service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    @GetMapping("/farmers")
    public String getFarmers(Model model) {
        model.addAttribute("farmers", farmerService.getAllFarmers());
        return "farmers";
    }

    @PostMapping("/farmer/new")
    public String newFarmer(@ModelAttribute("farmer")Farmer farmer) {
        farmerService.saveFarmer(farmer);
        return "redirect:/index";
    }

    @GetMapping("/farmer/info/edit/{id}")
    public String editFarmerInfo(@PathVariable Long id, Model model) {
        model.addAttribute("farmer", farmerService.getFarmer(id));
        return "farmer_info";
    }

    @PostMapping("/farmer/{id}")
    public String updateFarmerInfo(@PathVariable Long id, @ModelAttribute("farmer") Farmer farmer) {
        Farmer existingFarmer = farmerService.getFarmer(id);

        existingFarmer.setSpeciality(farmer.getSpeciality());
        farmerService.saveFarmer(existingFarmer);
        return "redirect:/farmer_info";
    }

}
