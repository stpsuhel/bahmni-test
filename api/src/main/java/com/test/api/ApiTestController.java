package com.test.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiTestController {
    
    @GetMapping("/test/{name}")
    public String test(@PathVariable String name) {
        ApiApplication application = new ApiApplication();
        application.test(name);
        return "Test name: " + name;
    }
}