package com.quiz.Questions_Service.services;

import org.springframework.stereotype.Service;

@Service
public class PrinterService {

    public String printHello(String username){
        return "Hello "+username+", Welcome!!!";
    }

}
