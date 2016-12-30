package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能: 排行榜
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:31
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rank implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 7010983510793626088L;

    /**
     * 排行
     */
    @JsonProperty(value = "Ranking")
    private int ranking;

    /**
     * 用户账号
     */
    @JsonProperty(value = "Customer")
    private String customer;

    /**
     * 回报率
     */
    @JsonProperty(value = "ReturnRate")
    private BigDecimal returnRate;

    /**
     * 年化回报率
     */
    @JsonProperty(value = "YearReturnRate")
    private BigDecimal yearReturnRate;

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public BigDecimal getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(BigDecimal returnRate) {
        this.returnRate = returnRate;
    }

    public BigDecimal getYearReturnRate() {
        return yearReturnRate;
    }

    public void setYearReturnRate(BigDecimal yearReturnRate) {
        this.yearReturnRate = yearReturnRate;
    }
}
