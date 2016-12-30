package com.lecheng.trade.facade.dto.infos.goods;

import java.io.Serializable;

/**
 * 功能: 获取商品列表请求
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 13:34
 * 版本: V1.0
 */
public class GetListRequest implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -5688223498853491709L;

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
