package com.aloha.spring.core.assignment.sec03;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "dev", "default" })
@Service
public class DevDataSourceProvider implements DataSourceStringProvider {

    @Override
    public String datasource() {
        return "datasource:dev";
    }

}
