package com.test.omod;

import com.test.api.ApiApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    
    @GetMapping("/test")
    public String test() {
        ApiApplication application = new ApiApplication();
        application.test("name");
        return "Test name: " + "name";
    }
}
