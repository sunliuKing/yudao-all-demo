package com.yudaodemo.labx08scgatewaydemo07sentinel.handler;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author sunliu
 * @ClassName CustomBlockRequestHandler
 * @Description
 * @Time 2024/9/14 14:14
 */
@Component
public class CustomBlockRequestHandler implements BlockRequestHandler {

    private static final String DEFAULT_BLOCK_MSG_PREFIX = "HAHAHA ~ Blocked by Sentinel: ";

    public Mono<ServerResponse> handleRequest(ServerWebExchange exchange, Throwable ex) {
        return ServerResponse.status(HttpStatus.TOO_MANY_REQUESTS) // 状态码
                .contentType(MediaType.TEXT_PLAIN) // 内容类型为 text/plain 纯文本
                .bodyValue(DEFAULT_BLOCK_MSG_PREFIX + ex.getClass().getSimpleName()); // 错误提示
    }

}
