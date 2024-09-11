package com.yudaodemo.labx01scanacosdiscoverydemo01provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient //开启注册中心
public class Demo01ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ProviderApplication.class, args);
    }

    @RestController
    static class TestController {
        @GetMapping("/echo")
        public String echo(String name) {
            return "provider:" + name;
        }

    }

}
