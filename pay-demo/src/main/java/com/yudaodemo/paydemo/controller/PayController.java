package com.yudaodemo.paydemo.controller;

import com.yudaodemo.paydemo.abstracts.AbstractPaymentStrategy;
import com.yudaodemo.paydemo.factory.PaymentStrategyFactory;
import com.yudaodemo.paydemo.strategy.PaymentStrategy;
import com.yudaodemo.paydemo.strategy.impl.AliPay;
import com.yudaodemo.paydemo.strategy.impl.UnionPay;
import com.yudaodemo.paydemo.strategy.impl.WeChatPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunliu
 * @ClassName PayController
 * @Description
 * @Time 2024/9/12 20:19
 */
@RestController
public class PayController {
    @Autowired
    PaymentStrategyFactory paymentStrategyFactory;

    @RequestMapping("/pay1")
    public void pay1(int payType, double amount) {
        PaymentStrategy paymentStrategy;
        switch (payType) {
            case 1:
                paymentStrategy = new AliPay();
                break;
            case 2:
                paymentStrategy = new WeChatPay();
                break;
            case 3:
                paymentStrategy = new UnionPay();
                break;
            default:
                throw new RuntimeException("暂不支持该支付方式");
        }
        paymentStrategy.pay(amount);
    }

    @RequestMapping("/pay2")
    public void pay2(int payType, double amount) {
        AbstractPaymentStrategy paymentStrategy = paymentStrategyFactory.getPaymentStrategy(payType);
        paymentStrategy.commonPay(amount);
    }
}
