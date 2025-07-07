package com.aloha.spring.core.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("lifecycleDemoBean")
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware, BeanPostProcessor {

    @SuppressWarnings("unused")
    private String javaVer;

    public LifecycleDemoBean() {
        log.info("## I am in the constuctor. ##");
    }

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        log.info("## 1 Properties set. Java Ver: {}", javaVer);
    }

    @Override
    public void setBeanName(@NonNull String name) {
        log.info("## 2 BeanNameAware - My bean name is: {}", name);
    }

    @Override
    public void setBeanFactory(@NonNull BeanFactory beanFactory) throws BeansException {
        log.info("## 3 BeanFactoryAware - Bean factory has been set: {}", beanFactory);
    }

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        log.info("## 4 ApplicationContextAware - Application context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("## 5 The @PostConstruct annotated method has been called.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("## 6 afterPropertiesSet - Populate the properites. The bean has its properties set.");
    }

    @PreDestroy
    public void preDestory() {
        log.info("## 7 The @PreDestroy annotated method has been called.");
    }

    /*
     * @Se
     */
    @Override
    public void destroy() throws Exception {
        log.info("## 8 DisposableBean.destory The bean has been determinated.");
    }

    @Override
    @Nullable
    public Object postProcessAfterInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        log.info("## postProcessAfterInitialization: {}", beanName);
        if (bean instanceof MyController) {
            MyController controller = (MyController) bean;
            log.info("## Calling LifecycleDemoBean.afterInit");
            controller.afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    @Nullable
    public Object postProcessBeforeInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        log.info("## postProcessBeforeInitialization: {}", beanName);
        if (bean instanceof MyController) {
            MyController controller = (MyController) bean;
            log.info("## Calling LifecycleDemoBean.beforeInit");
            controller.beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    public void beforeInit() {
        log.info("## - Before Init - Called by BeanPostProcessor.");
    }

    public void afterInit() {
        log.info("## - After Init - Called by BeanPostProcessor.");
    }

}
