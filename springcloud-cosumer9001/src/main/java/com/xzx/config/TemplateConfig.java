package com.xzx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: TemplateConfig
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 11:57
 * @Version: 1.0
 **/
@Configuration
public class TemplateConfig {
    @Bean
    public RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
