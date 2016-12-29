package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 报价
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:20
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6068244332337985917L;

    /**
     * 商品类型
     */
    @JsonProperty(value = "TypeCode")
    private String typeCode;

    /**
     * 当前报价
     */
    @JsonProperty(value = "CurPrice")
    private BigDecimal curPrice;

    /**
     * 瞬时涨跌(相对于上一口报价)
     */
    @JsonProperty(value = "UpDown")
    private int upDown;

    /**
     * 今开盘
     */
    @JsonProperty(value = "Open")
    private BigDecimal open;

    /**
     * 昨收盘
     */
    @JsonProperty(value = "Close")
    private BigDecimal close;

    /**
     * 最高价
     */
    @JsonProperty(value = "High")
    private BigDecimal high;

    /**
     * 最低价
     */
    @JsonProperty(value = "Low")
    private BigDecimal low;

    /**
     * 报价日
     */
    @JsonProperty(value = "PriceDate")
    private Date priceDate;

    /**
     * 报价时间
     */
    @JsonProperty(value = "PriceTime")
    private Date priceTime;

    /**
     * 当前交易日(休市时返回空)
     */
    @JsonProperty(value = "MarketDate")
    private Date marketDate;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public BigDecimal getCurPrice() {
        return curPrice;
    }

    public void setCurPrice(BigDecimal curPrice) {
        this.curPrice = curPrice;
    }

    public int getUpDown() {
        return upDown;
    }

    public void setUpDown(int upDown) {
        this.upDown = upDown;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public Date getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(Date priceDate) {
        this.priceDate = priceDate;
    }

    public Date getPriceTime() {
        return priceTime;
    }

    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    public Date getMarketDate() {
        return marketDate;
    }

    public void setMarketDate(Date marketDate) {
        this.marketDate = marketDate;
    }
}
