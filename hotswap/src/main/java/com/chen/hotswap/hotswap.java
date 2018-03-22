package com.chen.hotswap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class hotswap {
    @RequestMapping("/test")
    public String testHotswap(){
        return "hello hotswap";
    }
}
