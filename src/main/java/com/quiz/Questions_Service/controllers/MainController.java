package com.quiz.Questions_Service.controllers;

import com.quiz.Questions_Service.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private PrinterService printerService;

    @GetMapping("/greet/{username}")
    public String printGreetings(@PathVariable String username){
        return printerService.printHello(username);
    }
}
