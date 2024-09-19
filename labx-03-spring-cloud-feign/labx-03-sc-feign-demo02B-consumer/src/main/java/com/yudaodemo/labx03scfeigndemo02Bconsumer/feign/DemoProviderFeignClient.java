package com.yudaodemo.labx03scfeigndemo02Bconsumer.feign;

import com.yudaodemo.labx03scfeigndemo02Bconsumer.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo-provider",configuration = DefaultFeignClientConfiguration.class)
public interface DemoProviderFeignClient {

    @GetMapping("/echo")
    String echo(@RequestParam("name") String name);

}