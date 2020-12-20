package study.wyy.cloud.hystrix.order.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeoutException;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 6:00 下午
 */
@FeignClient(value = "cloud-consumer-hystic",fallback = PaymentHystrixFallbackService.class)
public interface PaymentHystrixService {

    /**
     *  使用Feign的时候,如果参数中带有
     *
     * @PathVariable 形式的参数,则要用value=""标明对应的参数,否则会抛出IllegalStateException异常
     */
    @GetMapping("/provider/hystrix/timeout/{time}")
    String testTimeout(@PathVariable(value = "time") Integer time) throws TimeoutException;


    /**
     *  使用Feign的时候,如果参数中带有
     *
     * @PathVariable 形式的参数,则要用value=""标明对应的参数,否则会抛出IllegalStateException异常
     */
    @GetMapping("/provider/hystrix/timeout/{time}")
    String testTimeout2(@PathVariable(value = "time") Integer time) throws TimeoutException;


    @GetMapping("/provider/hystrix/error")
    String testError();
}


