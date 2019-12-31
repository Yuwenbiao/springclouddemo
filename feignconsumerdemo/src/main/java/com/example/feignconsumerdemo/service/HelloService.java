package com.example.feignconsumerdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * hello
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/12/30 22:11
 */
@FeignClient("main-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
}
