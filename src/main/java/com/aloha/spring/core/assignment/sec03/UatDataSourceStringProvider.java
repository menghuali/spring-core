package com.aloha.spring.core.assignment.sec03;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatDataSourceStringProvider implements DataSourceStringProvider{

    @Override
    public String datasource() {
        return "datasource:uat";
    }

}
