package com.lecheng.trade.facade.dto.prices.kchart;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import java.io.Serializable;

/**
 * 功能: 查询K线请求
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:14
 * 版本: V1.0
 */
public class GetRequest implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 3296979146072161746L;

    /**
     * 商品类型
     */
    @NotBlank(message = "商品类型不能为空")
    private String goodsType;

    /**
     * K线类型,包括：1-1分钟K线，2-5分K线，3-15分K线，4-30分K线，5-60分K线，5-日K线
     */
    @Range(min = 1, max = 5, message = "K线类型不正确")
    private int chartType;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getChartType() {
        return chartType;
    }

    public void setChartType(int chartType) {
        this.chartType = chartType;
    }
}
