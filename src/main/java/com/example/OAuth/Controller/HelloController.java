package com.example.OAuth.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/public")
    public String publicEndpoint() {
        return "Public";
    }
    @GetMapping("/api/private")
    public String privateEndpoint() {
        return "Private";
    }
}