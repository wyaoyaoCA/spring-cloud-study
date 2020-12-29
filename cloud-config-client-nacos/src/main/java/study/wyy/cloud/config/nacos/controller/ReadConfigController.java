package study.wyy.cloud.config.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/29 9:15 下午
 */
@RestController
@RefreshScope
public class ReadConfigController {


    @Value("${config.info}")
    String info;

    @GetMapping("/nacos/config/getInfo")
    public String getInfo(){
        return info;
    }
}
