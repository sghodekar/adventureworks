package com.trailblaze.adventureworks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvWorksHelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

}
