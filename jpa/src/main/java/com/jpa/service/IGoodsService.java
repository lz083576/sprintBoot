package com.jpa.service;

import com.jpa.domain.Goods;

public interface IGoodsService {
    /**
     * 更改商品库存
     *
     * @param id
     * @param decStock 减去库存数量
     * @return
     */
    Goods decreaseStock(long id, int decStock) throws InterruptedException;
}
