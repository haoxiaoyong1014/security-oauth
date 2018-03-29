package com.hxy.oauth.token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



/**
 * Created by hxy on 2018/3/28.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
public class oauthApp {
    public static void main(String[] args) {
        SpringApplication.run(oauthApp.class,args);
    }


}
