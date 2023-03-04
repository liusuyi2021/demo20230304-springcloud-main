package com.xzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: product8001Application
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 9:51
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class product8001Application {
    public static void main(String[] args) {
        SpringApplication.run(product8001Application.class);
    }
}
