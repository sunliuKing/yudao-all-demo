package com.yudaodemo.labx03scfeigndemo02Aconsumer.controller;

import com.yudaodemo.labx03scfeigndemo02Aconsumer.feign.DemoProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private DemoProviderFeignClient demoProviderFeignClient;

    @GetMapping("/hello02")
    public String hello02(String name) {
        // 使用 Feign 调用接口
        String response = demoProviderFeignClient.echo(name);
        // 返回结果
        return "consumer:" + response;
    }

}