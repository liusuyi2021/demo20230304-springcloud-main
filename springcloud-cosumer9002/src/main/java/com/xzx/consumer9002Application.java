package com.xzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: consumer9001Application
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 11:03
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
public class consumer9002Application {
    public static void main(String[] args) {
        SpringApplication.run(consumer9002Application.class);
    }
}
