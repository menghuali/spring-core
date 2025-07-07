package com.aloha.spring.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aloha.spring.core.controller.MyI18nController;

@SpringBootTest
public class MyI18nControllerDefaultProfileTests {

    @Autowired
    private MyI18nController myI18nController;

    @Test
    public void testSayHello() {
        assertEquals("Hello!!!", myI18nController.sayHello());
    }

}
