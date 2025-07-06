package com.aloha.spring.core.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.aloha.spring.core.service.GreetingService;

@Controller
public class MyI18nController {

    private final GreetingService greetingService;

    public MyI18nController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
