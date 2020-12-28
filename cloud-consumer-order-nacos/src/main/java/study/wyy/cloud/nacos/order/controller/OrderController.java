package study.wyy.cloud.nacos.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private final String PROVIDER_URL = "http://cloud-payment-service-nacos";
    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(("/consume/payment/nacos/{id}"))
    public String consume(@PathVariable Long id){
        String result = restTemplate.getForObject(PROVIDER_URL + "/payment/"+id, String.class);
        return result;
    }
}
