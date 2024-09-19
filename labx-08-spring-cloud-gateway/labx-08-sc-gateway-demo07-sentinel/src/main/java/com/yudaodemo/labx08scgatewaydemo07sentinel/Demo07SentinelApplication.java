package com.yudaodemo.labx08scgatewaydemo07sentinel;

import com.alibaba.cloud.sentinel.gateway.ConfigConstants;
import com.alibaba.csp.sentinel.config.SentinelConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunliu
 * @ClassName Demo07Application
 * @Description
 * @Time 2024/9/14 14:11
 */
@SpringBootApplication
public class Demo07SentinelApplication {
    public static void main(String[] args) {
        System.setProperty(SentinelConfig.APP_TYPE, ConfigConstants.APP_TYPE_SCG_GATEWAY); // 【重点】设置应用类型为 Spring Cloud Gateway
        SpringApplication.run(Demo07SentinelApplication.class, args);
    }
}
