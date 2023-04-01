package com.example.march2023.controller;

import com.example.march2023.model.CalculateResponse;
import com.example.march2023.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    @Autowired //Dependency Injection
    CalculateService cService;

    @GetMapping("/add/{first}/{second}")
    public ResponseEntity<Object> add(@PathVariable("first") double firstNumber,
                              @PathVariable("second") double secondNumber){
        System.out.println("INSIDE THE CALCULATE CONTROLLER");
        if((firstNumber == 0) || (secondNumber ==0))
            return new ResponseEntity<>("One of the input is 0, please check and try again", HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(cService.addService(firstNumber, secondNumber), HttpStatus.OK);
    }

    @GetMapping("/add/v2/{first}/{second}")
    public CalculateResponse addV2(@PathVariable("first") double firstNumber,
                                   @PathVariable("second") double secondNumber){
        System.out.println("INSIDE THE CALCULATE CONTROLLER");
        CalculateResponse cResponse = new CalculateResponse();

        if((firstNumber == 0) || (secondNumber ==0)){
            cResponse.setStatus(400);
            cResponse.setErrorMessage("One of the input is 0, please check and retry again");
            cResponse.setOperationResult(0);
            return cResponse;
        }

        cResponse.setStatus(200);
        cResponse.setErrorMessage("Success");
        cResponse.setOperationResult(cService.addService(firstNumber, secondNumber));
        return cResponse;
    }

    public double subtract(@PathVariable("first") double firstNumber,
                      @PathVariable("second") double secondNumber){
        return 0;
    }
}
