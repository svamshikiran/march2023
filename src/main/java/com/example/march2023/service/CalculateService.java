package com.example.march2023.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateService {

    public double addService(double firstNumber, double secondNumber){
        System.out.println("INSIDE THE CALCULATE SERVICE");
        return firstNumber + secondNumber;
    }
}

//@RestController
//@Service
//@Repository
//@Component
//@Bean