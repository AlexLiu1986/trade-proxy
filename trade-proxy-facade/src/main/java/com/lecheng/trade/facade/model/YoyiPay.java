package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 甬易充值
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:22
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class YoyiPay implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 1180609054910302692L;

    /**
     * 接口名称
     */
    @JsonProperty(value = "interfaceName")
    private String interfaceName;

    /**
     * 版本号
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * 交易数据(所有交易数据的xml明文Base64编码)
     */
    @JsonProperty(value = "tranData")
    private String tranData;

    /**
     * 签名
     */
    @JsonProperty(value = "merSignMsg")
    private String merSignMsg;

    /**
     * 商户号
     */
    @JsonProperty(value = "merchantId")
    private String merchantId;

    /**
     * post表单代码
     */
    @JsonProperty(value = "htmlContent")
    private String htmlContent;

    /**
     * 交易请求地址
     */
    @JsonProperty(value = "url")
    private String url;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTranData() {
        return tranData;
    }

    public void setTranData(String tranData) {
        this.tranData = tranData;
    }

    public String getMerSignMsg() {
        return merSignMsg;
    }

    public void setMerSignMsg(String merSignMsg) {
        this.merSignMsg = merSignMsg;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
