package com.lecheng.trade.facade.dto.prices.markettime;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能: 查询交易时间请求
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:14
 * 版本: V1.0
 */
public class GetRequest implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 694162964201676431L;

    /**
     * 商品类型
     */
    @NotBlank(message = "商品类型不能为空")
    private String goodsType;

    /**
     * 指定日期(传空为当天,yyyy-MM-dd)
     */
    private Date marketDate;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Date getMarketDate() {
        return marketDate;
    }

    public void setMarketDate(Date marketDate) {
        this.marketDate = marketDate;
    }
}
