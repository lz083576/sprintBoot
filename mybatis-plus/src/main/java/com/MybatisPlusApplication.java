package com;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MybatisPlusApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(MybatisPlusApplication.class, args);
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
