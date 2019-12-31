package com.example.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulDemoApplication.class, args);
    }

}
