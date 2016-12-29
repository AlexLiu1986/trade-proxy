package com.lecheng.trade.facade.dto.prices.realtime;

import java.io.Serializable;

/**
 * 功能: 查询报价请求
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:14
 * 版本: V1.0
 */
public class GetListRequest implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -3196841642015913394L;

    /**
     * 商品类型
     */
    private String goodsType;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
}
