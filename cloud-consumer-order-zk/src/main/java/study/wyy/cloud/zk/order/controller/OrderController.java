package study.wyy.cloud.zk.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import study.wyy.cloud.api.model.CommonResult;
import study.wyy.cloud.api.model.Payment;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/14 6:27 下午
 */
@RestController
@Slf4j
public class OrderController {

    private final String PAYMENT_ADDRESS = "http://cloud-payment-service";

    private final RestTemplate restTemplate;

    @Autowired
    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/consume/payment/zk/hello")
    public String consumeCreatePayment(){
        // 调用支付服务的payment/zk/hello接口
        String s = restTemplate.getForObject(PAYMENT_ADDRESS + "/payment/zk/hello", String.class);
        return s;
    }
}
