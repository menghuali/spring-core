package com.aloha.spring.core.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("my_controller")
public class MyController {

    public void helloWorld() {
        log.info("Hello, World! I am {}.", this.getClass().getSimpleName());
    }

}
