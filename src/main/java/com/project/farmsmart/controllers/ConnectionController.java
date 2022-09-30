package com.project.farmsmart.controllers;

import com.project.farmsmart.entities.Connection;
import com.project.farmsmart.service.ConnectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConnectionController {

    private final ConnectionService connectionService;

    public ConnectionController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @GetMapping("/my_connections")
    public String getMyConnections(Model model) {
        model.addAttribute("connection", connectionService.getAllConnections());
        return "my_connections";
    }

    @GetMapping("/my_connections/new")
    public String newConnection(Model model) {
        Connection connection = new Connection();
        model.addAttribute("connection", connection);

        return "create_connection";
    }

    @PostMapping("/my_connections")
    public String saveConnection(@ModelAttribute("connection") Connection connection) {
        connectionService.saveConnection(connection);
        return "redirect:/my_connections";
    }

    @GetMapping("/my_connections/{id}")
    public String deleteConnection(@PathVariable Long id) {
        connectionService.deleteConnectionById(id);

        return "redirect:/my_connections";
    }
}
