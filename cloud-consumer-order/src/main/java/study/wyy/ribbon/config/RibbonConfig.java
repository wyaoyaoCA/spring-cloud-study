package study.wyy.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by wyaoyao
 * @Description
 * @Date 2020/12/15 4:23 下午
 */
@Configuration
public class RibbonConfig {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
