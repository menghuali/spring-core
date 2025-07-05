package com.aloha.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aloha.spring.core.service.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
