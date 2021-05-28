package com.wee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author zhanjiawei
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/get")
    public Map<String,Object> get(){
        Map<String,Object> result = new HashMap<>();
        result.put("code",1);
        result.put("msg","succe");
        result.put("data", Math.random());
        return result;
    }

}
