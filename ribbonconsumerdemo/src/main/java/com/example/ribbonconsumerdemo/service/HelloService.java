package com.example.ribbonconsumerdemo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * hello
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/12/30 15:01
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://MAIN-SERVICE/hello", String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}
