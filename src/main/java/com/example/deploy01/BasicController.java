package com.example.deploy01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BasicController {
    @GetMapping
    public String devName () {
        return "Saverio";
    }
}
