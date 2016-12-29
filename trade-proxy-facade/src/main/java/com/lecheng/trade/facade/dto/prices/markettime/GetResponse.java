package com.lecheng.trade.facade.dto.prices.markettime;

import com.lecheng.trade.facade.dto.BaseResponse;

import java.util.Date;

/**
 * 功能: 查询交易时间请求
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 14:13
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4032648194211331384L;

    /**
     * 商品类型
     */
    private String goodsType;

    /**
     * 交易日
     */
    private Date marketDate;

    /**
     * 当日交易状态(1-开市，0-休市)
     */
    private int marketStatus;

    /**
     * 开盘时间1
     */
    private Date openTime1;

    /**
     * 收盘时间1
     */
    private Date closeTime1;

    /**
     * 开盘时间2
     */
    private Date openTime2;

    /**
     * 收盘时间2
     */
    private Date closeTime2;

    /**
     * 开盘时间3
     */
    private Date openTime3;

    /**
     * 收盘时间2
     */
    private Date closeTime3;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

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

    public int getMarketStatus() {
        return marketStatus;
    }

    public void setMarketStatus(int marketStatus) {
        this.marketStatus = marketStatus;
    }

    public Date getOpenTime1() {
        return openTime1;
    }

    public void setOpenTime1(Date openTime1) {
        this.openTime1 = openTime1;
    }

    public Date getCloseTime1() {
        return closeTime1;
    }

    public void setCloseTime1(Date closeTime1) {
        this.closeTime1 = closeTime1;
    }

    public Date getOpenTime2() {
        return openTime2;
    }

    public void setOpenTime2(Date openTime2) {
        this.openTime2 = openTime2;
    }

    public Date getCloseTime2() {
        return closeTime2;
    }

    public void setCloseTime2(Date closeTime2) {
        this.closeTime2 = closeTime2;
    }

    public Date getOpenTime3() {
        return openTime3;
    }

    public void setOpenTime3(Date openTime3) {
        this.openTime3 = openTime3;
    }

    public Date getCloseTime3() {
        return closeTime3;
    }

    public void setCloseTime3(Date closeTime3) {
        this.closeTime3 = closeTime3;
    }
}
