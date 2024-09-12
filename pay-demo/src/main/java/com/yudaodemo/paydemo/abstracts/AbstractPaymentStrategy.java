package com.yudaodemo.paydemo.abstracts;

import com.yudaodemo.paydemo.strategy.PaymentStrategy;

/**
 * @author sunliu
 * @ClassName AbstractPaymentStrategy
 * @Description
 * @Time 2024/9/12 20:39
 */
public abstract class AbstractPaymentStrategy implements PaymentStrategy {
    public void commonPay(double amount) {
        check(amount);

        pay(amount);
    }

    private void check(double amount) {
        if (amount == 0) {
            throw new RuntimeException("金额不合法");
        }
    }
}
