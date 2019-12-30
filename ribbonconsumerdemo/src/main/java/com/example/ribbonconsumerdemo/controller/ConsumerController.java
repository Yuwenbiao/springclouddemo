package com.example.ribbonconsumerdemo.controller;

import com.example.ribbonconsumerdemo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 主控制器
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/12/27 21:48
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/ribbonConsumer", method = RequestMethod.GET)
    public String hello() {
        return restTemplate.getForEntity("http://MAIN-SERVICE/hello", String.class).getBody();
    }

    @RequestMapping(value = "/ribbon-consumer-hystrix", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.helloService();
    }
}