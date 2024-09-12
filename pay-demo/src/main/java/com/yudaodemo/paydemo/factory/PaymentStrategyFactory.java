package com.yudaodemo.paydemo.factory;

import com.yudaodemo.paydemo.abstracts.AbstractPaymentStrategy;
import com.yudaodemo.paydemo.strategy.PaymentStrategy;
import com.yudaodemo.paydemo.strategy.impl.AliPay;
import com.yudaodemo.paydemo.strategy.impl.UnionPay;
import com.yudaodemo.paydemo.strategy.impl.WeChatPay;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author sunliu
 * @ClassName PaymentStrategyFactory
 * @Description
 * @Time 2024/9/12 20:28
 */
@Component
public class PaymentStrategyFactory implements ApplicationContextAware {
    // 加入需要自动装配mapper new AliPay(); 无法实现
    // 采用 ApplicationContextAware
    ApplicationContext applicationContext;

    public AbstractPaymentStrategy getPaymentStrategy(int payType) {
        switch (payType) {
            case 1:
                // return new AliPay();
                return applicationContext.getBean(AliPay.class);
            case 2:
                // return new WeChatPay();
                return applicationContext.getBean(WeChatPay.class);
            case 3:
                // return new UnionPay();
                return applicationContext.getBean(UnionPay.class);
            default:
                throw new RuntimeException("暂不支持该支付方式");
        }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
