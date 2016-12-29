package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: K线数据
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 11:49
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceKChart implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 7857216786737798377L;

    /**
     * 报价时间
     */
    @JsonProperty(value = "PriceDateTime")
    private Date priceDateTime;

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

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
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
}
