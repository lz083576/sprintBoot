package com.jpa.service.impl;

import com.jpa.dao.GoodsDao;
import com.jpa.domain.Goods;
import com.jpa.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IGoodsServiceImpl implements IGoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods decreaseStock(long id, int decStock) throws InterruptedException {
        //首先获取商品信息
        Goods oldGood = goodsDao.getOne(id);
        try {
            //减库存
            if (oldGood.getStock() - decStock >= 0) {
                oldGood.setStock(oldGood.getStock() - decStock);
                return goodsDao.saveAndFlush(oldGood);
            }
        } catch (Exception e) {
            throw new InterruptedException("删减库存" + decStock + "失败！并发冲突！");
        }
        //返回null值表示库存已被清空，实际场景可自行处理，这里只是示例
        return null;
    }
}
