package com.xzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: com.xzx.EurekaApplication
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 9:36
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Application.class);
    }
}
