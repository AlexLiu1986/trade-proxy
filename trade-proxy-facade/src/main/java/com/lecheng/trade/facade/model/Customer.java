package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 用户
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 13:49
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -8648845207871063750L;

    /**
     * 用户ID
     */
    @JsonProperty(value = "ID")
    private String id;

    /**
     * 登录账号
     */
    @JsonProperty(value = "LoginId")
    private String loginId;

    /**
     * 注册时间
     */
    @JsonProperty(value = "RegistTime")
    private Date registTime;

    /**
     * 会员ID
     */
    @JsonProperty(value = "MemberID")
    private String memberID;

    /**
     * 会员编号
     */
    @JsonProperty(value = "MemberNo")
    private String memberNo;

    /**
     * 会员名称
     */
    @JsonProperty(value = "MemberName")
    private String memberName;

    /**
     * 会员手机号
     */
    @JsonProperty(value = "MemberTel")
    private String memberTel;

    /**
     * 居间编号
     */
    @JsonProperty(value = "MediacyNo")
    private String mediacyNo;

    /**
     * 居间名称
     */
    @JsonProperty(value = "MediacyName")
    private String mediacyName;

    /**
     * 经纪人编号
     */
    @JsonProperty(value = "AgentNo")
    private String agentNo;

    /**
     * 经纪人名称
     */
    @JsonProperty(value = "AgentName")
    private String agentName;

    /**
     * 账户现金余额
     */
    @JsonProperty(value = "Balance")
    private BigDecimal balance;

    /**
     * 账户红包余额
     */
    @JsonProperty(value = "Coupon")
    private BigDecimal coupon;

    /**
     * 红包有效期
     */
    @JsonProperty(value = "CouponDeadline")
    private Date CouponDeadline;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberTel() {
        return memberTel;
    }

    public void setMemberTel(String memberTel) {
        this.memberTel = memberTel;
    }

    public String getMediacyNo() {
        return mediacyNo;
    }

    public void setMediacyNo(String mediacyNo) {
        this.mediacyNo = mediacyNo;
    }

    public String getMediacyName() {
        return mediacyName;
    }

    public void setMediacyName(String mediacyName) {
        this.mediacyName = mediacyName;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public Date getCouponDeadline() {
        return CouponDeadline;
    }

    public void setCouponDeadline(Date couponDeadline) {
        CouponDeadline = couponDeadline;
    }
}
