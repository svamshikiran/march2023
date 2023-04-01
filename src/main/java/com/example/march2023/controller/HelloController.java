package com.example.march2023.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/greet")
    public String sayHello(){
        return "WELCOME TO SPRINGBOOT FRAMEWORK";
    }

    @GetMapping("/greet/{name}") //mapping with input parameter
    public String sayHelloWithName(@PathVariable("name") String inputName){
        return "HELLO "+inputName+", WELCOME TO SPRINGBOOT FRAMEWORK";
    }
}
