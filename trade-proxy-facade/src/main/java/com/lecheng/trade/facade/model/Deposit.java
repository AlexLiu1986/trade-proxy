package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 充值记录
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 17:48
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposit implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 2753151365866818899L;

    /**
     * 充值订单流水号
     */
    @JsonProperty(value = "ID")
    private long id;

    /**
     * 客户ID
     */
    @JsonProperty(value = "CustomerID")
    private int customerID;

    /**
     * 入金金额
     */
    @JsonProperty(value = "Amount")
    private BigDecimal amount;

    /**
     * 入金时间
     */
    @JsonProperty(value = "DepositTime")
    private Date depositTime;

    /**
     * 入金方式
     */
    @JsonProperty(value = "DepositType")
    private String depositType;

    /**
     * 入金方式名
     */
    @JsonProperty(value = "DepositTypeName")
    private String depositTypeName;

    /**
     * 入金状态：1-处理中，2-成功，3-失败
     */
    @JsonProperty(value = "Status")
    private int status;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Date depositTime) {
        this.depositTime = depositTime;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getDepositTypeName() {
        return depositTypeName;
    }

    public void setDepositTypeName(String depositTypeName) {
        this.depositTypeName = depositTypeName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
