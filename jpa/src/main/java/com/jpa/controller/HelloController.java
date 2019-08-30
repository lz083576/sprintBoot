package com.jpa.controller;

import com.jpa.dao.GoodsDao;
import com.jpa.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private GoodsDao goodsDao;

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        System.out.println("被回调的值name：" + name);
        return "hello " + name + "，this is first messge";
    }

    @RequestMapping("/goods")
    public String index2() {
        List<Goods> all = goodsDao.findAll();
        all.stream().forEach(goods -> {
            System.out.println(goods.getName());
        });
        return "hello " + all.get(0).getName();
    }

}

