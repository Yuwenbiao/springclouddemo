package com.example.maindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主控制器
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/12/27 21:48
 */
@RestController
public class MainController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}