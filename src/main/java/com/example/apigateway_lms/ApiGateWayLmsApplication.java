package com.example.apigateway_lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGateWayLmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayLmsApplication.class, args);
        System.out.println("Hello");
    }

}
