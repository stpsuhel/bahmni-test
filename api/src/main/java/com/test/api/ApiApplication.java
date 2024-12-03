package com.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ApiApplication {
    public void test(String name) {
        System.out.println("This is a test from: " + name);
    }
}
