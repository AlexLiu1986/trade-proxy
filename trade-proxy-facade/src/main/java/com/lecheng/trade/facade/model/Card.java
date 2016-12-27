package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 银行卡
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 17:48
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Card implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -5300092579975721865L;

    /**
     * ID
     */
    @JsonProperty(value = "ID")
    private int id;

    /**
     * 用户ID
     */
    @JsonProperty(value = "CustomerId")
    private int customerId;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
}
