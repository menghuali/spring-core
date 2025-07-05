package com.aloha.spring.core.service;

import org.springframework.stereotype.Service;

// Use a custom component name
@Service("secondaryGreeting")
public class GreetingServiceSecondary implements GreetingService {

    @Override
    public String sayGreeting() {
         return "Hello everyone from secondary service!!!";
    }

}
