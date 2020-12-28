package payment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/10/27 8:37 下午
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient // 开启服务注册发现
public class PayServiceNacosApp {

    public static void main(String[] args) {
        SpringApplication.run(PayServiceNacosApp.class,args );
    }
}
