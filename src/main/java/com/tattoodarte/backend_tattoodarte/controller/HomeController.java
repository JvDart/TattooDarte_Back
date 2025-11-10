package com.tattoodarte.backend_tattoodarte.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Backend TattooDarte está funcionando correctamente ✅";
    }
}