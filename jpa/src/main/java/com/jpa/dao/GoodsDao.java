package com.jpa.dao;

import com.jpa.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;


public interface GoodsDao extends JpaRepository<Goods, Long> {

    @Override
    List<Goods> findAll();

    /**
     * 自定义查询方式
     */
    List<Goods> findAllByNameAndGmtModifiedAfter(String name, Timestamp timestamp);
}

