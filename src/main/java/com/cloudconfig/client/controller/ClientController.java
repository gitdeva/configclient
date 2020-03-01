//package com.cloudconfig.client.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ClientController {
//    @Value("${user.role:Config server is not working}")
//    private String userRole;
//
//    @GetMapping("/userRoles")
//    public String getUserRole(){
//        return this.userRole;
//    }
//}
