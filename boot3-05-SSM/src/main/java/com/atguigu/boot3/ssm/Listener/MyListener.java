package com.atguigu.boot3.ssm.Listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

@Slf4j
public class MyListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        log.info("1.starting=======监听器正在启动");
        System.out.println("1.starting=======监听器正在启动中");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        log.info("2.environmentPrepared====环境准备完成");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("3.contextPrepared=====IOC容器准备完成");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("4.contextLoaded=====内容加载完成");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("5.started======启动完成");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("6.ready======准备就绪");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        log.info("7.failed======启动失败");
    }
}
