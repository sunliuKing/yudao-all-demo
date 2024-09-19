package com.yudaodemo.labx03scfeigndemo02Bconsumer.config;// DefaultFeignClientConfiguration.java

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * 全局 FeignClient 配置类
 */
public class DefaultFeignClientConfiguration {

    @Bean
    public Logger.Level defaultFeignClientLoggerLevel() {
        return Logger.Level.BASIC;
    }

}