package study.wyy.cloud.nacos.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/28 10:25 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceAppNacos {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceAppNacos.class, args);
    }
}
