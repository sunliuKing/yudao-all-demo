package com.yudaodemo.labx01scanacosdiscoverydemo02provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo02ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo02ProviderApplication.class, args);
    }

    @RestController
    static class TestController {
        @GetMapping("/echo")
        public String echo(String name) {
            return "provider:" + name;
        }
    }
}
