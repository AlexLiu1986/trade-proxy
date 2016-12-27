package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 账户流水
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:44
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountFlow implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 5459802922330694034L;

    /**
     * ID
     */
    @JsonProperty(value = "ID")
    private long id;

    /**
     * 流水类型
     */
    @JsonProperty(value = "FlowType")
    private int flowType;

    /**
     * 流水类型名
     */
    @JsonProperty(value = "FlowName")
    private String flowName;

    /**
     * 收支类型(1:收入; 2:支出)
     */
    @JsonProperty(value = "InOut")
    private int inOut;

    /**
     * 金额
     */
    @JsonProperty(value = "Amount")
    private BigDecimal amount;

    /**
     * 账户余额
     */
    @JsonProperty(value = "AccountBalance")
    private BigDecimal amountBalance;

    /**
     * 发生时间
     */
    @JsonProperty(value = "FlowTime")
    private Date flowTime;

    /**
     * 备注
     */
    @JsonProperty(value = "Comment")
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFlowType() {
        return flowType;
    }

    public void setFlowType(int flowType) {
        this.flowType = flowType;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public int getInOut() {
        return inOut;
    }

    public void setInOut(int inOut) {
        this.inOut = inOut;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountBalance() {
        return amountBalance;
    }

    public void setAmountBalance(BigDecimal amountBalance) {
        this.amountBalance = amountBalance;
    }

    public Date getFlowTime() {
        return flowTime;
    }

    public void setFlowTime(Date flowTime) {
        this.flowTime = flowTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
