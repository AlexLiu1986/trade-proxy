package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 易生支付
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:37
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EasyPay implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 6520150659387064465L;

    /**
     * 合作伙伴编号
     */
    @JsonProperty(value = "partner_id")
    private String partner_id;

    /**
     * 接口名称
     */
    @JsonProperty(value = "method")
    private String method;

    /**
     * 指定相应形式（默认xml）
     */
    @JsonProperty(value = "format")
    private String format;

    /**
     * 请求使用的编码格式
     */
    @JsonProperty(value = "charset")
    private String charset;

    /**
     * 签名的加密方法
     */
    @JsonProperty(value = "sign_method")
    private String sign_method;

    /**
     * 签名
     */
    @JsonProperty(value = "sign")
    private String sign;

    /**
     * 发送请求的时间
     */
    @JsonProperty(value = "timestamp")
    private String timestamp;

    /**
     * API协议版本
     */
    @JsonProperty(value = "v")
    private String v;

    /**
     * 对参数biz_content进行AES加密的密钥
     */
    @JsonProperty(value = "random_key")
    private String random_key;

    /**
     * 请求参数的集合
     */
    @JsonProperty(value = "biz_content")
    private String biz_content;

    /**
     * 交易请求地址
     */
    @JsonProperty(value = "url")
    private String url;

    public String getPartner_id() {
        return partner_id;
    }

    public void setPartner_id(String partner_id) {
        this.partner_id = partner_id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getSign_method() {
        return sign_method;
    }

    public void setSign_method(String sign_method) {
        this.sign_method = sign_method;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getRandom_key() {
        return random_key;
    }

    public void setRandom_key(String random_key) {
        this.random_key = random_key;
    }

    public String getBiz_content() {
        return biz_content;
    }

    public void setBiz_content(String biz_content) {
        this.biz_content = biz_content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
