package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 持仓
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:14
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Position implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 5092673059470009250L;

    /**
     * 持仓流水号
     */
    @JsonProperty(value = "ID")
    private long id;

    /**
     * 客户ID
     */
    @JsonProperty(value = "CustomerID")
    private int customerID;

    /**
     * 商品代码
     */
    @JsonProperty(value = "Code")
    private String code;

    /**
     * 商品类型代码
     */
    @JsonProperty(value = "TypeCode")
    private String typeCode;

    /**
     * 商品名称
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * 每手数量
     */
    @JsonProperty(value = "AmountPerLot")
    private BigDecimal amountPerLot;

    /**
     * 买卖方向(1-买,2-卖)
     */
    @JsonProperty(value = "BuySell")
    private int buySell;

    /**
     * 持仓手数
     */
    @JsonProperty(value = "Amount")
    private BigDecimal amount;

    /**
     * 建仓价格
     */
    @JsonProperty(value = "OpenPrice")
    private BigDecimal openPrice;

    /**
     * 建仓时间
     */
    @JsonProperty(value = "PositionTime")
    private Date positionTime;

    /**
     * 建仓成本(保证金)
     */
    @JsonProperty(value = "OpenCost")
    private BigDecimal openCost;

    /**
     * 建仓手续费
     */
    @JsonProperty(value = "OpenCharge")
    private BigDecimal openCharge;

    /**
     * 建仓时红包支付金额
     */
    @JsonProperty(value = "CouponCost")
    private BigDecimal couponCost;

    /**
     * 平仓时间(未平仓时为空)
     */
    @JsonProperty(value = "CloseTime")
    private Date closeTime;

    /**
     * 平仓价格(未平仓时为当前价格)
     */
    @JsonProperty(value = "ClosePrice")
    private BigDecimal closePrice;

    /**
     * 交易盈亏(未平仓时为当前浮动盈亏)
     */
    @JsonProperty(value = "GrossProfit")
    private BigDecimal grossProfit;

    /**
     * 止盈(不设则为空)
     */
    @JsonProperty(value = "Limit")
    private BigDecimal limit;

    /**
     * 止损(不设则为空)
     */
    @JsonProperty(value = "Stop")
    private BigDecimal stop;

    /**
     * 平仓类型 1:普通平仓; 2:自动平仓; 3:爆仓平仓; 4:收盘平仓; 5:强制平仓
     */
    @JsonProperty(value = "CloseType")
    private int closeType;

    /**
     * 是否过夜
     */
    @JsonProperty(value = "IsDeferred")
    private int isDeferred;

    /**
     * 累计过夜费
     */
    @JsonProperty(value = "Deferred")
    private BigDecimal deferred;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmountPerLot() {
        return amountPerLot;
    }

    public void setAmountPerLot(BigDecimal amountPerLot) {
        this.amountPerLot = amountPerLot;
    }

    public int getBuySell() {
        return buySell;
    }

    public void setBuySell(int buySell) {
        this.buySell = buySell;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public Date getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Date positionTime) {
        this.positionTime = positionTime;
    }

    public BigDecimal getOpenCost() {
        return openCost;
    }

    public void setOpenCost(BigDecimal openCost) {
        this.openCost = openCost;
    }

    public BigDecimal getOpenCharge() {
        return openCharge;
    }

    public void setOpenCharge(BigDecimal openCharge) {
        this.openCharge = openCharge;
    }

    public BigDecimal getCouponCost() {
        return couponCost;
    }

    public void setCouponCost(BigDecimal couponCost) {
        this.couponCost = couponCost;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getStop() {
        return stop;
    }

    public void setStop(BigDecimal stop) {
        this.stop = stop;
    }

    public int getCloseType() {
        return closeType;
    }

    public void setCloseType(int closeType) {
        this.closeType = closeType;
    }

    public int getIsDeferred() {
        return isDeferred;
    }

    public void setIsDeferred(int isDeferred) {
        this.isDeferred = isDeferred;
    }

    public BigDecimal getDeferred() {
        return deferred;
    }

    public void setDeferred(BigDecimal deferred) {
        this.deferred = deferred;
    }
}
