package payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import study.wyy.cloud.api.model.CommonResult;
import study.wyy.cloud.api.model.Payment;
import study.wyy.cloud.api.service.PaymentService;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 9:14 下午
 */
@RestController
@Slf4j
public class PaymentController {


    // 获取配置文件中的端口号
    @Value("${server.port}")
    private String port;


    @GetMapping("/payment/{id}")
    public String findById(@PathVariable("id") Long id){
        return "find " + id + " from payment port " + port;
    }
}
