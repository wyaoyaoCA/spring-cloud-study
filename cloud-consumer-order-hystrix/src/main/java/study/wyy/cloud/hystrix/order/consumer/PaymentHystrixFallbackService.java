package study.wyy.cloud.hystrix.order.consumer;


import org.springframework.stereotype.Component;

import java.util.concurrent.TimeoutException;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 7:40 下午
 */
@Component
public class PaymentHystrixFallbackService implements PaymentHystrixService{
    @Override
    public String testTimeout(Integer time) throws TimeoutException {
        return "invoke provider time out on testTimeout";
    }

    @Override
    public String testTimeout2(Integer time) throws TimeoutException {
        return "invoke provider time out on testTimeout2";
    }

    @Override
    public String testError() {
        return "invoke provider time error";
    }
}
