package com.project.farmsmart.controllers;

import com.project.farmsmart.entities.Buyer;
import com.project.farmsmart.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/buyers")
    public String getCustomers(Model model) {
        model.addAttribute("buyers", buyerService.getAllBuyers());
        return "customers";
    }

    @PostMapping("/buyer/new")
    public String newCustomer(@ModelAttribute("buyer") Buyer buyer) {
        buyerService.saveBuyer(buyer);
        return "redirect:/index";
    }

    @GetMapping("/buyer/info/edit/{id}")
    public String editBuyerInfo(@PathVariable Long id, Model model) {
        model.addAttribute("buyer", buyerService.getBuyer(id));
        return "edit_buyer";
    }

    @PostMapping("/buyer/{id}")
    public String updateBuyerInfo(@PathVariable Long id, @ModelAttribute("buyer") Buyer buyer) {
        Buyer existingBuyer = buyerService.getBuyer(id);

        existingBuyer.setBuyerType(buyer.getBuyerType());

        buyerService.updateBuyer(existingBuyer);
        return "redirect:/user_info";
    }

}
