package com.hxyapp.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by hxy on 2018/3/28.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableEurekaServer
@SpringBootApplication
public class eurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApp.class,args);
    }
}
