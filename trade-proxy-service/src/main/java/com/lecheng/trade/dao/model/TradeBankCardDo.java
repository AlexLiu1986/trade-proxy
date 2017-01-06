package com.lecheng.trade.dao.model;

/**
 * 功能: 银行卡信息
 * 创建: liuchongguang
 * 日期: 2017/1/6 0006 11:12
 * 版本: V1.0
 */
public class TradeBankCardDo extends BaseDo {

    /**
     * 用户ID
     */
    private Integer customerId;

    /**
     * 远程银行卡号ID
     */
    private Integer bankCardId;

    /**
     * 银行
     */
    private String bank;

    /**
     * 支行
     */
    private String branchBank;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 银行卡号
     */
    private String cardNo;

    /**
     * 持卡人姓名
     */
    private String name;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
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
