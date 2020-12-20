package study.wyy.cloud.feign.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import study.wyy.cloud.api.model.CommonResult;
import study.wyy.cloud.api.model.Payment;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 8:40 上午
 */
/******
 * @FeignClient: value属性指定调用的服务在注册中心上的名字
 */
@FeignClient(value = "cloud-payment-service")
public interface PaymentService {

    /*****
     * 调用支付服务的id查询方法
     * @param id
     * @return
     */
    @GetMapping("/payment/{id}")
    public CommonResult<Payment> invokeFindById(@PathVariable("id") Long id);

    /*****
     * 调用支付服务的创建支付单方法
     * @param
     * @return
     */
    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment);

}
