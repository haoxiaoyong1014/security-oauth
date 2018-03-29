package com.hxy.company.api.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hxy on 2018/3/29.
 * E-mail:hxyHelloWorld@163.com
 * github:https://github.com/haoxiaoyong1014
 */
@RestController
public class DemoController {

    @RequestMapping("/demo")
    @PreAuthorize("hasAuthority('client')")
    public String grant(){
        return "ok";
    }
    @RequestMapping("/demo2")
    @PreAuthorize("hasAuthority('select')")
    public String granthe(){

        return "yes";
    }
}
