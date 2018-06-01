package com.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.client.dao")
public class ServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceClientApplication.class, args);
    }
}
