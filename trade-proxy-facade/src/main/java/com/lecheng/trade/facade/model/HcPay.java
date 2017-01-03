package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 汇潮充值
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:46
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HcPay implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 1011356987033500002L;

    /**
     * 充值金额
     */
    @JsonProperty(value = "Amount")
    private String amount;

    /**
     * 商户号
     */
    @JsonProperty(value = "MerNo")
    private String merNo;

    /**
     * 订单号
     */
    @JsonProperty(value = "BillNo")
    private String billNo;

    /**
     * 页面跳转同步通知页面
     */
    @JsonProperty(value = "ReturnURL")
    private String returnURL;

    /**
     * 服务器异步通知路径
     */
    @JsonProperty(value = "AdviceURL")
    private String adviceURL;

    /**
     * 签名信息
     */
    @JsonProperty(value = "SignInfo")
    private String signInfo;

    /**
     * 发送请求的时间
     */
    @JsonProperty(value = "OrderTime")
    private String orderTime;

    /**
     * 备注
     */
    @JsonProperty(value = "Remark")
    private String remark;

    /**
     * 物品信息
     */
    @JsonProperty(value = "products")
    private String products;

    /**
     * 银行编码
     */
    @JsonProperty(value = "defaultBankNumber")
    private String defaultBankNumber;

    /**
     * 支付方式
     */
    @JsonProperty(value = "payType")
    private String payType;

    /**
     * 交易请求地址
     */
    @JsonProperty(value = "url")
    private String url;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMerNo() {
        return merNo;
    }

    public void setMerNo(String merNo) {
        this.merNo = merNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getReturnURL() {
        return returnURL;
    }

    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }

    public String getAdviceURL() {
        return adviceURL;
    }

    public void setAdviceURL(String adviceURL) {
        this.adviceURL = adviceURL;
    }

    public String getSignInfo() {
        return signInfo;
    }

    public void setSignInfo(String signInfo) {
        this.signInfo = signInfo;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getDefaultBankNumber() {
        return defaultBankNumber;
    }

    public void setDefaultBankNumber(String defaultBankNumber) {
        this.defaultBankNumber = defaultBankNumber;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
