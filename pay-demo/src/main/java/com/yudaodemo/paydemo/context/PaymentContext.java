package com.yudaodemo.paydemo.context;

import com.yudaodemo.paydemo.strategy.PaymentStrategy;
import com.yudaodemo.paydemo.strategy.impl.AliPay;
import com.yudaodemo.paydemo.strategy.impl.UnionPay;
import com.yudaodemo.paydemo.strategy.impl.WeChatPay;
import org.springframework.stereotype.Service;

/**
 * @author sunliu
 * @ClassName PaymentContext
 * @Description
 * @Time 2024/9/12 20:24
 */

@Service
public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(int payType) {
        switch (payType) {
            case 1:
               this.paymentStrategy = new AliPay();
                break;
            case 2:
                this.paymentStrategy = new WeChatPay();
                break;
            case 3:
                this.paymentStrategy = new UnionPay();
                break;
            default:
                throw new RuntimeException("暂不支持该支付方式");
        }
    }

    public void pay(double amount) throws IllegalAccessException {
        if (paymentStrategy==null){
            throw new IllegalAccessException("支付策略未设置");
        }
        paymentStrategy.pay(amount);
    }
}
