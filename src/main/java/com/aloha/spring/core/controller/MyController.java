package com.aloha.spring.core.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("my_controller")
public class MyController {

    public void helloWorld() {
        log.info("Hello, World! I am {}.", this.getClass().getSimpleName());
    }

    public void beforeInit() {
        log.info("## - Before Init - Called by BeanPostProcessor.");
    }

    public void afterInit() {
        log.info("## - After Init - Called by BeanPostProcessor.");
    }

}
