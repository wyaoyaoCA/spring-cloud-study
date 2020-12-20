package study.wyy.cloud.hystrix.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import study.wyy.cloud.hystrix.order.consumer.PaymentHystrixService;

import java.util.concurrent.TimeoutException;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 6:13 下午
 */
@RestController
public class OrderHystrixController2 {

    private final PaymentHystrixService paymentHystrixService;

    public OrderHystrixController2(PaymentHystrixService paymentHystrixService) {
        this.paymentHystrixService = paymentHystrixService;
    }

    @GetMapping("/consumer2/hystrix/timeout/{time}")
    public String testTimeout(@PathVariable Integer time) throws TimeoutException {
        return paymentHystrixService.testTimeout(time);
    }


    @GetMapping("/consumer2/hystrix/timeout2/{time}")
    public String testTimeout2(@PathVariable Integer time) throws TimeoutException {
        return paymentHystrixService.testTimeout2(time);
    }

    @GetMapping("/consumer2/hystrix/error")

    public String testError(){
        return paymentHystrixService.testError();
    }
}
