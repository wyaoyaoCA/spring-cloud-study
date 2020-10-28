package study.wyy.cloud.payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 8:37 下午
 */
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class PayServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(PayServiceApp.class,args );
    }
}
