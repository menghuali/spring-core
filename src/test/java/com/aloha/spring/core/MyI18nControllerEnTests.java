package com.aloha.spring.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.aloha.spring.core.controller.MyI18nController;

@ActiveProfiles("EN")
@SpringBootTest
public class MyI18nControllerEnTests {

    @Autowired
    private MyI18nController myI18nController;

    @Test
    public void testSayHello() {
        assertEquals("Hello!!!", myI18nController.sayHello());
    }

}
