package com.lz.consum;


import org.springframework.stereotype.Component;

/**
 * 回调类，远程调用失败后调用此方法，需要在远程调用接口上提供fallback属性
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(String name) {
        return "hello" + name + ", this messge send failed ";
    }
}
