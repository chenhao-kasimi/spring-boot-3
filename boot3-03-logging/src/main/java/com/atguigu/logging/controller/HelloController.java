package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        log.info("info日志启动");
        log.warn("warn日志启动");
        log.error("error日志启动");


        log.trace("trace日志启动");

        return "hello";
    }
}
