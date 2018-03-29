package com.hxyapp.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by hxy on 2018/3/28.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableOAuth2Sso
public class gatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(gatewayApp.class,args);
    }
}
