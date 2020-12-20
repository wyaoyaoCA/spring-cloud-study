package study.wyy.cloud.feign.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import study.wyy.cloud.api.model.CommonResult;
import study.wyy.cloud.api.model.Payment;
import study.wyy.cloud.feign.order.service.PaymentService;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 9:10 上午
 */
@RestController
@Slf4j
public class OrderController {

    private final PaymentService paymentService;

    public OrderController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/consume/payment/create/{serial}")
    public CommonResult consumeCreatePayment(@PathVariable("serial") String serial){
        Payment payment = new Payment();
        payment.setSerial(serial);
        //CommonResult commonResult = restTemplate.postForObject(PAYMENT_ADDRESS + "/payment/create", payment, CommonResult.class);
        // 之前通过restTemplate 改为使用Feign调用
        CommonResult<Integer> commonResult = paymentService.create(payment);
        return commonResult;
    }

    @GetMapping("/consume/payment/find/{id}")
    public CommonResult consumeFindPayment(@PathVariable("id") Long id){
        System.out.println(1111);
        // CommonResult commonResult = restTemplate.getForObject(PAYMENT_ADDRESS + "/payment/" + id, CommonResult.class);
        // 之前通过restTemplate 改为使用Feign调用
        CommonResult<Payment> paymentCommonResult = paymentService.invokeFindById(id);
        return paymentCommonResult;
    }
}
