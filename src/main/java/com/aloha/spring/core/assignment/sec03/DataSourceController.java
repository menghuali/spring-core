package com.aloha.spring.core.assignment.sec03;

import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceStringProvider dataSourceStringProvider;

    public DataSourceController(DataSourceStringProvider dataSourceStringProvider) {
        this.dataSourceStringProvider = dataSourceStringProvider;
    }

    public String getDataSourceString() {
        return dataSourceStringProvider.datasource();
    }

}
