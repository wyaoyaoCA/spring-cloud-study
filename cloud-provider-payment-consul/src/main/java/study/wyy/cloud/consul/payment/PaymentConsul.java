package study.wyy.cloud.consul.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/15 8:19 上午
 */
@EnableDiscoveryClient// 开启服务发现
@Slf4j
@SpringBootApplication
public class PaymentConsul {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsul.class,args);
    }
}
