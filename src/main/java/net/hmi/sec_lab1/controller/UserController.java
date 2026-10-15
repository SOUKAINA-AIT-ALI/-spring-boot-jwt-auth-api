package net.hmi.sec_lab1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Bienvenue dans l'API sécurisée";
    }

    @GetMapping("/profile")
    public String profile(Authentication authentication) {
        return "Utilisateur connecté : " + authentication.getName();
    }
}
