package com.project.farmsmart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Pages {

    @GetMapping("/index")
    public String index() {
        return "index";
    }



    @GetMapping("/error_404")
    public String error404() {
        return "error-404";
    }

    @GetMapping("/error_500")
    public String error500() {
        return "error-500";
    }

//    @GetMapping("/buyers")
//    public String buyers() {
//        return "buyers";
//    }
//
//    @GetMapping("/my_connections")
//    public String myConnections() {
//        return "my_connections";
//    }
//
//    @GetMapping("/my_products")
//    public String myProducts() {
//        return "my_products";
//    }
//
//    @GetMapping("/my_posts")
//    public String myPosts() {
//        return "my_posts";
//    }
//
//    @GetMapping("/timeline")
//    public String timeline() {
//        return "timeline";
//    }
//
//    @GetMapping("/user/info/{id}")
//    public String userInfo() {
//        return "user_info";
//    }
//
//    @GetMapping("/farmers")
//    public String farmers() {
//        return "farmers";
//    }
    
}
