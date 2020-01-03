package com.example.configserverdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 *
 * @author yuwb@corp.21cn.com
 * @date 2019/12/31 14:15
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDemoApplication.class, args);
    }

}
