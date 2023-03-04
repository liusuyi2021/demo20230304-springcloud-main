package com.xzx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: indexController
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月04日 10:58
 * @Version: 1.0
 **/
@RestController
public class indexController {
    @GetMapping("/user/{id}")
    String queryById(@PathVariable("id") Long id) {
        return "生产者id：" + id;
    }
}
