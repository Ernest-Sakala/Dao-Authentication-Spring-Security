package com.project.farmsmart.controllers;

import com.project.farmsmart.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificationsController {

    private final NotificationService notificationService;

    public NotificationsController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/my_notifications")
    public String getNotifications(Model model) {
        model.addAttribute("notification", notificationService.getAllNotifications());
        return "index";
    }


}
