package com.test.omod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.test.api"})
public class OmodApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(OmodApplication.class, args);
    }
}
