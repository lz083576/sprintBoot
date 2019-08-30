package com.study.plus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.plus.mapper.UserMapper;
import com.study.plus.pojo.User;
import com.study.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lz
 * @since 2019-08-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Autowired
    UserMapper userMapper;

    /*public List<Map<String, Object>> mybatuisPlusTest(){

        return  this.baseMapper.selectMaps(null);
    }*/

    public List<Map<String, Object>> mybatuisPlusTest(){

        return  userMapper.selectMaps(null);
    }

    /**
     * 测试分页
     * @return
     */
    public PageInfo<User> pageList(){
        PageHelper.startPage(1, 2);
        List<User> selectList = this.baseMapper.selectList(new QueryWrapper<User>());
        PageInfo<User> pageInfo = new PageInfo<User>(selectList);
        return pageInfo;
    }



    @Override
    public boolean saveOrUpdateBatch(Collection<User> entityList) {
        return super.saveOrUpdateBatch(entityList);
    }

}
