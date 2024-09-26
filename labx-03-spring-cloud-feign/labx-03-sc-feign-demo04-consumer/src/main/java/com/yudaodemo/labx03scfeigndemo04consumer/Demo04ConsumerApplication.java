package com.yudaodemo.labx03scfeigndemo04consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author sunliu
 * @ClassName Demo01ConsumerApplication
 * @Description
 * @Time 2024/9/18 20:41
 */
@SpringBootApplication
@EnableFeignClients
public class Demo04ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo04ConsumerApplication.class, args);
    }

}
