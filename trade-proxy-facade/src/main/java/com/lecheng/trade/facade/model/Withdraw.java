package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 提现记录
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 10:52
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Withdraw implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 2113997471008427496L;

    /**
     * 提现订单流水号
     */
    @JsonProperty(value = "ID")
    private long id;

    /**
     * 客户ID
     */
    @JsonProperty(value = "CustomerID")
    private int customerID;

    /**
     * 提现金额
     */
    @JsonProperty(value = "Amount")
    private BigDecimal amount;

    /**
     * 提现手续费
     */
    @JsonProperty(value = "Charge")
    private BigDecimal charge;

    /**
     * 提现时间
     */
    @JsonProperty(value = "WithdrawTime")
    private Date withdrawTime;

    /**
     * 处理时间
     */
    @JsonProperty(value = "HandleTime")
    private Date handleTime;

    /**
     * 银行
     */
    @JsonProperty(value = "Bank")
    private String bank;

    /**
     * 支行
     */
    @JsonProperty(value = "BranchBank")
    private String branchBank;

    /**
     * 省份
     */
    @JsonProperty(value = "Province")
    private String province;

    /**
     * 城市
     */
    @JsonProperty(value = "City")
    private String city;

    /**
     * 银行卡号
     */
    @JsonProperty(value = "CardNo")
    private String cardNo;

    /**
     * 持卡人姓名
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * 备注
     */
    @JsonProperty(value = "Comment")
    private String comment;

    /**
     * 提现状态：1-处理中，2-成功，3-失败
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

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public Date getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranchBank() {
        return branchBank;
    }

    public void setBranchBank(String branchBank) {
        this.branchBank = branchBank;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
