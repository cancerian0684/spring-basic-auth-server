package com.shunya.basicauth;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/secured/hello")
    public ServiceResponse hello() {
        return new ServiceResponse(true, "hello world");
    }

    @PostMapping("/secured/hello")
    public ServiceResponse securedHello(@RequestBody InputPayload payload) {
        return new ServiceResponse(true, "hello" + " " + payload.getName());
    }
}
