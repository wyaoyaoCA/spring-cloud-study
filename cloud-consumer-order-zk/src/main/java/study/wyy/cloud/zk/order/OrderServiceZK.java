package study.wyy.cloud.zk.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/14 6:20 下午
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class OrderServiceZK {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceZK.class,args);
    }
}
