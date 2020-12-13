package study.wyy.cloud.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import study.wyy.cloud.api.model.CommonResult;
import study.wyy.cloud.api.model.Payment;
import study.wyy.cloud.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 9:14 下午
 */
@RestController
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // 获取配置文件中的端口号
    @Value("${server.port}")
    private String port;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result>0){
        // 返回服务端口号
            return new CommonResult<Integer>(200,"create.success" + port,result);
        }else {
        // 返回服务端口号
            return new CommonResult<Integer>(500,"create.fail" + port,null);
        }
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> findById(@PathVariable("id") Long id){
        Payment result = paymentService.findById(id);
        // 返回服务端口号
        return new CommonResult<Payment>(200,"find.success" + port,result);
    }
}
