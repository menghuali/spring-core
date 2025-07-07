package com.aloha.spring.core.assignment.sec03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("qa")
@SpringBootTest
public class QaDataSourceControllerTests {

    @Autowired
    private DataSourceController controller;

    @Test
    public void testGetDataSourceString() {
        assertEquals("datasource:qa", controller.getDataSourceString());
    }

}
