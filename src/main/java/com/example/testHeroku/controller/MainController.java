package com.example.testHeroku.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${build.version}")
    private String buildVersion;

    @GetMapping("/")
    public String main() {
        return "BUILD VERSION: " + buildVersion;
    }
}