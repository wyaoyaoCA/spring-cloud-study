package study.wyy.cloud.payment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/13 9:00 下午
 */
@RestController
@Slf4j
public class DiscoverController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/discoveryClient")
    public void discoveryClient(){
        // 获取Eureka注册中心中的服务列表
        List<String> services = discoveryClient.getServices();
        services.forEach(i->{
            log.info("服务：{}",i);
        });

        services.forEach(i->{
            // 获取每个服务的实例
            List<ServiceInstance> instances = discoveryClient.getInstances(i);
            // 遍历
            instances.forEach(instance->{
                // 实例的主机地址
                String host = instance.getHost();
                // 实例的端口号
                int port = instance.getPort();
                // 获取实例的地址
                URI uri = instance.getUri();
                String scheme = instance.getScheme();
                // 获取实例的元数据
                Map<String, String> metadata = instance.getMetadata();
                log.info("实例主机地址: {} 实例端口号：{} 实例的uri: {} 实例的scheme： {}",host,port,uri.toString(),scheme);
                log.info("实例的元数据: {}",metadata);
                log.info("============================================================================");
            });
        });

    }
}
