package study.wyy.cloud.hystrix.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
public class OrderHystrixController {

    private final PaymentHystrixService paymentHystrixService;

    public OrderHystrixController(PaymentHystrixService paymentHystrixService) {
        this.paymentHystrixService = paymentHystrixService;
    }

    @GetMapping("/consumer/hystrix/timeout/{time}")
    @HystrixCommand(
            fallbackMethod ="invokeProviderTimeoutHandler",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
            }
    )
    public String testTimeout(@PathVariable Integer time) throws TimeoutException {
        return paymentHystrixService.testTimeout(time);
    }


    @GetMapping("/consumer/hystrix/timeout2/{time}")
    public String testTimeout2(@PathVariable Integer time) throws TimeoutException {
        return paymentHystrixService.testTimeout2(time);
    }

    @GetMapping("/consumer/hystrix/error")
    @HystrixCommand(
            fallbackMethod ="invokeProviderErrorHandler"
    )
    public String testError(){
        return paymentHystrixService.testError();
    }

    public String invokeProviderTimeoutHandler(Integer time){
        return "consumer invoke provider timeout, please wait";
    }
    public String invokeProviderErrorHandler(){
        return "consumer invoke provider error, please wait";
    }
}
