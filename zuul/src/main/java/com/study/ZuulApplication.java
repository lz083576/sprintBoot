package com.study;

import com.study.zuul.MyFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//网关代理
@EnableZuulProxy
@Slf4j
public class ZuulApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(ZuulApplication.class, args);
        long end = System.currentTimeMillis();
        log.info("######start time-use : " + (end - start) / 1000 + "s");
        log.info("######givepkg to start over, test log output:");
        log.trace("######test: trace");
        log.debug("######test: debug");
        log.info("######test: info");
        log.warn("######test: warn");
        log.error("######test: error");
    }

    @Bean
    public MyFilter tokenFilter(){
        return new MyFilter();
    }

}
