package study.wyy.cloud.zk.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/14 4:41 下午
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient // 开启服务发现
public class PaymentApplicationZK {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplicationZK.class,args);
    }
}
