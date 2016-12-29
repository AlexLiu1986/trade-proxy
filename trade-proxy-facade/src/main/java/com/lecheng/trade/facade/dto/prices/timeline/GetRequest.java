package com.lecheng.trade.facade.dto.prices.timeline;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 功能: 查询分时线请求
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:14
 * 版本: V1.0
 */
public class GetRequest implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 8563414650886181544L;

    /**
     * 商品类型
     */
    @NotBlank(message = "商品类型不能为空")
    private String goodsType;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
}
