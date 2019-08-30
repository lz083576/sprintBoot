package com.lz.consum;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//其中fallback是熔断后执行的回调类
@FeignClient(name = "product", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
