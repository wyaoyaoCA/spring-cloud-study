package study.wyy.cloud.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import study.wyy.cloud.hystrix.service.HystrixService;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 2:25 下午
 */
@RestController
public class HystrixController {

    private final HystrixService hystrixService;
    @Autowired
    public HystrixController(HystrixService hystrixService) {
        this.hystrixService = hystrixService;
    }

    @GetMapping("/provider/hystrix/timeout/{time}")
    public String testTimeout(@PathVariable Integer time) throws TimeoutException {
       return hystrixService.testTimeout(time);
    }


    @GetMapping("/provider/hystrix/error")
    public String testError(){
        return hystrixService.testError();
    }


}
