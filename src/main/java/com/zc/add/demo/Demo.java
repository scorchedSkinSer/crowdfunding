package com.zc.add.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/go")
public class Demo {

    @RequestMapping("demo1")
    public String demo1(){
        return "焦增辉";
    }
}
