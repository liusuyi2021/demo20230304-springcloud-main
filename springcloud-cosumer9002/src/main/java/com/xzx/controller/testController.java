package com.xzx.controller;

import com.xzx.feign.feignClient;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: testController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 11:10
 * @Version: 1.0
 **/
@RestController
public class testController {
    @Resource
    feignClient client;
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    String test()
    {
        String id = client.getID(123l);
        return "获取到生产者的id："+id;
    }
    @GetMapping("/getInstance")
    public Object discovery() {
        //获取服务名
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }
//        //根据微服务实例名称获取微服务信息
//        List<ServiceInstance> instances = discoveryClient.getInstances("spring-cloud-provider-8001");
//        for (ServiceInstance info : instances) {
//            System.out.println(info);
       // }
        return  this.discoveryClient;
    }

}
