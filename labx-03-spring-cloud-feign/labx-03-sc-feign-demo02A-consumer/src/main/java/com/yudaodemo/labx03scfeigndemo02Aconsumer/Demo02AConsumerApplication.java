package com.yudaodemo.labx03scfeigndemo02Aconsumer;

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
@EnableFeignClients
public class Demo02AConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo02AConsumerApplication.class, args);
    }

}