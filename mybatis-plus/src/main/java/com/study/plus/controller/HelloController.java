package com.study.plus.controller;


import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.study.plus.pojo.User;
import com.study.plus.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lz
 * @since 2019-08-22
 */
@RestController
@RequestMapping
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello String Boot！";
    }



    @Autowired
    UserServiceImpl userService;

    @GetMapping("/select_map")
    public Object selectMapTest(){
        return userService.mybatuisPlusTest();
    }


    /**
     * 批量保存
     * @return
     */
    @GetMapping("/save_batch")
    public Boolean saveOrUpdateBatchTest(){
        List<User> userList = Lists.newArrayList(
                new User(null, "小萝莉", 18, "xiaoluoli@qq.com"),
                new User(null, "花花", 2, "huahua@qq.com")
        );
        //使用创建者模式设值实体类
        User u1 = User.builder().name("小萝莉").age(18).email("xiaoluoli@qq.com").build();
        return  userService.saveOrUpdateBatch(userList);
    }


    /**
     * 测试分ye
     */
    @GetMapping("/page")
    public Object testPage(){
        PageInfo<User> pageList = userService.pageList();
        return pageList;
    }


}

