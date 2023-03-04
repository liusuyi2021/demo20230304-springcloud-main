package com.xzx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @ClassName: feignClient
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 11:08
 * @Version: 1.0
 **/
@FeignClient("product8001")
public interface feignClient {
    @GetMapping("/user/{id}")
    String getID(@PathVariable Long id);
}
