package study.wyy.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import study.wyy.ribbon.config.RibbonConfig;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/28 8:55 下午
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClients({
        @RibbonClient(name = "cloud-payment-service",configuration = RibbonConfig.class)
})
public class OrderApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class,args);
    }
}
