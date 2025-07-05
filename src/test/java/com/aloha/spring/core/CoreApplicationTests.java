package com.aloha.spring.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.aloha.spring.core.controller.MyController;
import com.aloha.spring.unreachable.MyController2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class CoreApplicationTests {

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private MyController controller;

	@Test
	public void testBeanNotDefinedInAppPackageAndBelow() {
		assertThrows(NoSuchBeanDefinitionException.class, () -> ctx.getBean(MyController2.class));
	}

	@Test
	public void testBeanAutowired() {
		assertNotNull(controller);
	}

	@Test
	public void testBeanFromContextByClass() {
		MyController bean = ctx.getBean(MyController.class);
		assertNotNull(bean);
	}

	@Test
	public void testBeanFromContextByName() {
		MyController bean = (MyController) ctx.getBean("my_controller");
		assertNotNull(bean);
	}

	@Test
	void contextLoads() {
		assertNotNull(ctx);
	}

}
