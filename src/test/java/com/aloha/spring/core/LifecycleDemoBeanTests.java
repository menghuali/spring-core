package com.aloha.spring.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aloha.spring.core.controller.LifecycleDemoBean;

@SpringBootTest
public class LifecycleDemoBeanTests {

    @Autowired
    private LifecycleDemoBean lifecycleDemoBean;

    @Test
    public void testLifecycleDemoBean() {
        assertNotNull(lifecycleDemoBean);
    }

}
