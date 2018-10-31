package com.cloudbees.jx.dev.sarchtestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SteveController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello should be in testing environment";
    }
}
