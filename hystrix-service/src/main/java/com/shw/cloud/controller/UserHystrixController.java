package com.shw.cloud.controller;

import com.shw.cloud.service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author shw
 * @version 1.0
 * @date 2021/1/15 16:48
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserHystrixController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @Autowired
    private ServiceImpl service;

    @GetMapping("/testFallback/{id}")
    public String getUser(@PathVariable Long id) {
        return service.getUser(id);
    }

    @GetMapping("/testHello")
    public String testHello() {
        return restTemplate.getForObject(userServiceUrl + "/user/hello", String.class);
    }

}
