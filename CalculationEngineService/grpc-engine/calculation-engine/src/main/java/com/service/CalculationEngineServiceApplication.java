package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.service"})
public class CalculationEngineServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculationEngineServiceApplication.class, args);
        System.out.println("Welcome...\n");
    }

}