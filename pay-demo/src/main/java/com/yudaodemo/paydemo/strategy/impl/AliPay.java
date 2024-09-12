package com.yudaodemo.paydemo.strategy.impl;

import com.yudaodemo.paydemo.abstracts.AbstractPaymentStrategy;

/**
 * @author sunliu
 * @ClassName AliPay
 * @Description
 * @Time 2024/9/12 20:22
 */
public class AliPay extends AbstractPaymentStrategy {
    public void pay(double amount) {
        // 判断金额合法性
        //通过模板方法

        System.out.println("AliPay, 金额:" + amount);
    }
}
