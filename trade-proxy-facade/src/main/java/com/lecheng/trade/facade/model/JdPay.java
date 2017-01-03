package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 京东支付
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:01
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JdPay implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -4902001771015516886L;

    /**
     * 版本号
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * 商户号
     */
    @JsonProperty(value = "merchant")
    private String merchant;

    /**
     * 交易信息签名
     */
    @JsonProperty(value = "sign")
    private String sign;

    /**
     * 交易流水号
     */
    @JsonProperty(value = "tradeNum")
    private String tradeNum;

    /**
     * 交易金额
     */
    @JsonProperty(value = "amount")
    private String amount;

    /**
     * 支付成功跳转地址
     */
    @JsonProperty(value = "callbackUrl")
    private String callbackUrl;

    /**
     * 异步返回地址
     */
    @JsonProperty(value = "notifyUrl")
    private String notifyUrl;

    /**
     * 交易时间
     */
    @JsonProperty(value = "tradeTime")
    private String tradeTime;

    /**
     * 交易名称
     */
    @JsonProperty(value = "tradeName")
    private String tradeName;

    /**
     * 订单类型
     */
    @JsonProperty(value = "orderType")
    private String orderType;

    /**
     * 货币类型
     */
    @JsonProperty(value = "currency")
    private String currency;

    /**
     * 商户备注
     */
    @JsonProperty(value = "note")
    private String note;

    /**
     * 用户账号类型
     */
    @JsonProperty(value = "userType")
    private String userType;

    /**
     * 商户的用户账号
     */
    @JsonProperty(value = "userId")
    private String userId;

    /**
     * 交易请求地址
     */
    @JsonProperty(value = "url")
    private String url;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(String tradeNum) {
        this.tradeNum = tradeNum;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
