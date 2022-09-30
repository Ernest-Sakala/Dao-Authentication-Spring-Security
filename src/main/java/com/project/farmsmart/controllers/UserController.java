package com.project.farmsmart.controllers;

import com.project.farmsmart.entities.Buyer;
import com.project.farmsmart.entities.Farmer;
import com.project.farmsmart.entities.User;
import com.project.farmsmart.entities.UserDetailsImpl;
import com.project.farmsmart.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    private final UserService userService;
    @Autowired
    private final NotificationService notificationService;
    @Autowired
    private final FarmerService farmerService;
    @Autowired
    private final BuyerService buyerService;

    public UserController(UserService userService, NotificationService notificationService, FarmerService farmerService, BuyerService buyerService) {
        this.userService = userService;
        this.notificationService = notificationService;
        this.farmerService = farmerService;
        this.buyerService = buyerService;
    }


    @GetMapping("/login")
    public String login() {
        return "sign_in";
    }


    @GetMapping("/user/new")
    public String newUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/user/register")
    public String saveUser(@ModelAttribute("user") User user) {


        userService.saveUser(user);
//        if (Objects.equals(user.getUserType(), "Farmer")) {
//            Farmer farmer = new Farmer();
//            farmerService.saveFarmer(farmer);
//        } else if (Objects.equals(user.getUserType(), "Buyer")) {
//            Buyer buyer = new Buyer();
//            buyerService.saveBuyer(buyer);
//        }
        return "redirect:/";
    }

    @GetMapping("/user/info/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        model.addAttribute("user",userService.getUser(id));
        return "user_info";
    }

    @PostMapping("/user/info")
    public String updateUserInfo(@PathVariable Long id, @ModelAttribute("user") User user) {
        User existingUser = userService.getUser(id);

        existingUser.setUsername(user.getUsername());
        existingUser.setPhone(user.getPhone());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setLocation(user.getLocation());

        userService.updateUser(existingUser);

        return "redirect:/user_info";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUserAccount(@PathVariable Long id){
        userService.deleteUserById(id);
        return "redirect:/login";
    }

    @GetMapping("/notifications")
    public String notifications(Model model) {
        model.addAttribute("notifications", notificationService.getAllNotifications());
        return "notifications";
    }

    @GetMapping("/notification/{id}")
    public String getNotification(@PathVariable Long id, Model model) {
        model.addAttribute("notification",notificationService.getNotification(id));
        return "notification";
    }

    @GetMapping("/notification/delete/{id}")
    public String deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotificationById(id);
        return "notifications";
    }




}
