package com.aloha.spring.core.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.aloha.spring.core.service.GreetingService;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    // Use @Qualifer with the default component name (simple classname with first letter lower case)
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
