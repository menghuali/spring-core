package com.aloha.spring.core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nGreetingService")
public class SpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola!!!";
    }



}
