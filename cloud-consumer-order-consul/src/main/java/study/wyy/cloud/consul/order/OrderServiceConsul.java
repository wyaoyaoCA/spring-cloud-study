package study.wyy.cloud.consul.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/15 9:52 上午
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class OrderServiceConsul {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceConsul.class,args);
    }
}
