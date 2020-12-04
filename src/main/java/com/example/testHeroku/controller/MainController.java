package com.example.testHeroku.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final BuildProperties buildProperties;

    @GetMapping("/")
    public String main() {
        return "BUILD VERSION: " + buildProperties.getVersion();
    }
}