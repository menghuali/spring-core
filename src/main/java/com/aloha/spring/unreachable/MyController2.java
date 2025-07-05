package com.aloha.spring.unreachable;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MyController2 {

    public void helloWorld() {
        log.info("Hello, World! I am {}.", this.getClass().getSimpleName());
    }

}
