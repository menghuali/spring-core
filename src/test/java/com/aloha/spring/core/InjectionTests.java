package com.aloha.spring.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aloha.spring.core.controller.ConstructorInjectedController;
import com.aloha.spring.core.controller.PropertyInjectedController;
import com.aloha.spring.core.controller.SetterInjectedController;

@SpringBootTest
public class InjectionTests {

    @Autowired
    private PropertyInjectedController propertyInjectedController;

    @Autowired
    private SetterInjectedController setterInjectedController;

    @Autowired
    private ConstructorInjectedController constructorInjectedController;

    @Test
    public void testPropertyInjectedController() {
        assertEquals("Hello everyone from primary service!!!", propertyInjectedController.sayHello());
    }

    @Test
    public void testSetterInjectedController() {
        assertEquals("Hello everyone from secondary service!!!", setterInjectedController.sayHello());
    }

    @Test
    public void testConstructorInjectedController() {
        assertEquals("Hello everyone from base service!!!", constructorInjectedController.sayHello());
    }

}
