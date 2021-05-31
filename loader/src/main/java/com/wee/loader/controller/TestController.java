package com.wee.loader.controller;

import com.wee.common.uitl.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello/{str}")
    public Result hello(@PathVariable String str){
     return Result.success(str);
    }
}
