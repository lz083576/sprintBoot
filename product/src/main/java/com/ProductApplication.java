package com;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//用于该服务被注册中心发现
@EnableDiscoveryClient
@Slf4j
public class ProductApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(ProductApplication.class, args);
        long end = System.currentTimeMillis();
        log.info("######start time-use : " + (end - start) / 1000 + "s");
        log.info("######givepkg to start over, test log output:");
        log.trace("######test: trace");
        log.debug("######test: debug");
        log.info("######test: info");
        log.warn("######test: warn");
        log.error("######test: error");
    }

}
