package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }
	@GetMapping("/customInfo")
    public String customInfo() {
        return "Custom info endpoint";
    }

}
