package com.aloha.spring.core.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "EN", "default", "dev", "qa", "uat", "prod" })
@Service("i18nGreetingService")
public class EnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello!!!";
    }

}
