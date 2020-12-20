package study.wyy.cloud.feign.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/20 8:25 上午
 */
@SpringBootApplication
@EnableFeignClients
public class OrderApplicationFeign {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationFeign.class,args);
    }
}
