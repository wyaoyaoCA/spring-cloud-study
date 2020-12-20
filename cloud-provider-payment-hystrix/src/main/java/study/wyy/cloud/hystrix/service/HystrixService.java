package study.wyy.cloud.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 2:27 下午
 */
@Component
public class HystrixService {

    private final Long TIME_OUT = 5000L;

    // fallbackMethod: 指定的就是异常处理方法
    @HystrixCommand(fallbackMethod = "timeoutHandler",commandProperties = {
            // 配置超时时间为5秒钟，超过5s，超时异常处理方法为timeoutHandler
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value ="5000" )
    })
    public String testTimeout(Integer time) throws TimeoutException {
        long l = System.currentTimeMillis();
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long cost = (System.currentTimeMillis() - l) ;
        // 模拟超时，超时时间为5s
        if(cost>TIME_OUT){
            throw new TimeoutException("time out");
        }
        return "线程：" + Thread.currentThread().getName() + " invoke success cost time " + cost/1000 + "秒";
    }

    @HystrixCommand(fallbackMethod = "errorHandler")
    public String testError() {
        // 模拟个错误
        int a = 1/0;
        return "线程：" + Thread.currentThread().getName() + " invoke success";
    }

    public String timeoutHandler(Integer time){
        System.out.println("timeoutHandler : " + time);
        return "线程：" + Thread.currentThread().getName() + " 系统超时，请稍候再试 ";
    }

    public String errorHandler(){
        return "线程：" + Thread.currentThread().getName() + " 系统异常，请稍候再试 ";
    }
}
