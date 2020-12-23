package study.wyy.cloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/23 9:10 下午
 */
@RestController
@RefreshScope
public class ConfigTestController {

    @Value("${mysql.host}")
    private String host;

    @GetMapping("api/config/host/get")
    public String getHost(){
        return host;
    }
}
