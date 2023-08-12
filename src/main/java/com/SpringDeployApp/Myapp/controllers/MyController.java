package com.SpringDeployApp.Myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/api")
    public String message()
    {
        return "Welcome page yo!!";
    }
}
