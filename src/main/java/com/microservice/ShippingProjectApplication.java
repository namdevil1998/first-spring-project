package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.microservice"})
public class ShippingProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShippingProjectApplication.class, args);
    }

}
