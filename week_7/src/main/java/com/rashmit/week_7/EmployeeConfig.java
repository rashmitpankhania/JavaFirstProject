package com.rashmit.week_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {
    @Bean
    @Scope("prototype")
    public Employee f1(){
        return new Employee();
    }
}