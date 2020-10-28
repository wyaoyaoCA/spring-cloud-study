package study.wyy.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/28 8:55 下午
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}