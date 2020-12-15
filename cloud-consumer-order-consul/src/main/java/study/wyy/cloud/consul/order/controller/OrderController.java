package study.wyy.cloud.consul.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/15 10:19 上午
 */
@Slf4j
@RestController
public class OrderController {

    private final RestTemplate restTemplate;
    private final String PROVIDER_URL = "http://consul-provider-payment";
    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(("/consume/payment/consul/hello"))
    public String consume(){
        String result = restTemplate.getForObject(PROVIDER_URL + "/payment/consul/hello", String.class);
        return result;
    }
}
