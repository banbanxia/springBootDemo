package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LinyuZhang on 2017/7/13.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
}
