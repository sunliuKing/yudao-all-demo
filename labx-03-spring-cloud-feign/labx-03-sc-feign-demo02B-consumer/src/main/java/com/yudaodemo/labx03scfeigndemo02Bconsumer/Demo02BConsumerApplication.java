package com.yudaodemo.labx03scfeigndemo02Bconsumer;


import com.yudaodemo.labx03scfeigndemo02Bconsumer.config.DefaultFeignClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sunliu
 * @ClassName Demo02AConsumerApplication
 * @Description
 * @Time 2024/9/18 21:23
 */
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = DefaultFeignClientConfiguration.class)
public class Demo02BConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo02BConsumerApplication.class, args);
    }

}