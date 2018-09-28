package com.xiong.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/hello")
    public String index() {
        return configBean.toString();
    }
}
