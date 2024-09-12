package com.yudaodemo.paydemo.strategy.impl;

import com.yudaodemo.paydemo.abstracts.AbstractPaymentStrategy;

/**
 * @author sunliu
 * @ClassName WeChatPay
 * @Description
 * @Time 2024/9/12 20:21
 */
public class WeChatPay extends AbstractPaymentStrategy {
    public void pay(double amount) {
        System.out.println("WeChatPay, 金额:" + amount);
    }
}
