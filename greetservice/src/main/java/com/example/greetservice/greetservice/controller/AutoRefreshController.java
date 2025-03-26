package com.example.greetservice.greetservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class AutoRefreshController {

    @Value("${my.name}")
    String name;


    @GetMapping("/gt")
    public String getMMsg() {
        System.out.println("name is " + name);
        return name;
    }

}