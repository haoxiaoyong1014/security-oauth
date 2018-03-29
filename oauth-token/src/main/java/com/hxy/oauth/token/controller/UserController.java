package com.hxy.oauth.token.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by hxy on 2018/3/28.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RestController
public class UserController {
    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
