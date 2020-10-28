package study.wyy.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import study.wyy.cloud.api.model.CommonResult;
import study.wyy.cloud.api.model.Payment;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/28 8:47 下午
 */
@RestController
public class ConsumerController {

    private final String PAYMENT_ADDRESS = "http://localhost:8001";

    private final RestTemplate restTemplate;

    @Autowired
    public ConsumerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/consume/payment/create/{serial}")
    public CommonResult consumeCreatePayment(@PathVariable("serial") String serial){
        Payment payment = new Payment();
        payment.setSerial(serial);
        CommonResult commonResult = restTemplate.postForObject(PAYMENT_ADDRESS + "/payment/create", payment, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/consume/payment/find/{id}")
    public CommonResult consumeFindPayment(@PathVariable("id") Long id){
        System.out.println(1111);
        CommonResult commonResult = restTemplate.getForObject(PAYMENT_ADDRESS + "/payment/" + id, CommonResult.class);
        return commonResult;
    }
}
