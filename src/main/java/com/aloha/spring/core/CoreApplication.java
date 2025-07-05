package com.aloha.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.aloha.spring.core.controller.MyController;
import com.aloha.spring.unreachable.MyController2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CoreApplication.class, args);

		log.info("=== In main application ===\n");

		log.info("= Looking for bean in sub-package =");
		MyController myController = ctx.getBean(MyController.class);
		log.info("Bean found by class {}: {}", myController.getClass().getSimpleName(), myController);

		myController = (MyController) ctx.getBean("my_controller");
		log.info("Bean found by name {}: {}", "my_controller", myController);
		myController.helloWorld();

		log.info("= Looking for bean in other package =");
		MyController2 myController2 = null;
		try {
			myController2 = ctx.getBean(MyController2.class);
		} catch (Exception e) {
			log.error("Cannot found bean because it is NOT in App package or sub-packages", e);
		}
		log.info("Bean defined in other package: {}", myController2);
	}

}
