package study.wyy.cloud.consul.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/14 5:04 下午
 */
@RestController
public class HelloController {

    // 获取配置文件中的端口号
    @Value("${server.port}")
    private String port;

    @GetMapping("payment/consul/hello")
    public String hello(){
        return "Hello World From Port: " + port;
    }
}
