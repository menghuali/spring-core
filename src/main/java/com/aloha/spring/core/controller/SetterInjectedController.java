package com.aloha.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.aloha.spring.core.service.GreetingService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    // Use @Qaulifer with custom component name
    // @Qualifier("secondaryGreeting") // you can also annotate setter with @Qualifier
    @Autowired
    public void setGreetingService(@Qualifier("secondaryGreeting") GreetingService greetingService) {
        log.info("Setter injection in action...");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
