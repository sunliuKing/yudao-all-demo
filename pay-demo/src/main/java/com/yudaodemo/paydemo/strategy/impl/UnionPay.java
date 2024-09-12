package com.yudaodemo.paydemo.strategy.impl;

import com.yudaodemo.paydemo.abstracts.AbstractPaymentStrategy;
import com.yudaodemo.paydemo.strategy.PaymentStrategy;

/**
 * @author sunliu
 * @ClassName UnionPay
 * @Description
 * @Time 2024/9/12 20:22
 */
public class UnionPay extends AbstractPaymentStrategy {
    public void pay(double amount) {
        System.out.println("UnionPay, 金额:" + amount);
    }
}
