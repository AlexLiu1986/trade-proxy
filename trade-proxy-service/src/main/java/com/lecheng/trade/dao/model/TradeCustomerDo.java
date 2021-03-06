package com.lecheng.trade.dao.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 会员数据持久类
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 13:46
 * 版本: V1.0
 */
public class TradeCustomerDo extends BaseDo {

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 居间ID
     */
    private String mediacyId;

    /**
     * 经纪人ID
     */
    private String agentId;

    /**
     * 经济人手机号
     */
    private String agentMobile;

    /**
     * 推荐用户账号
     */
    private String recommendCustomer;

    /**
     * 登录账号
     */
    private String loginId;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 账户现金余额
     */
    private BigDecimal balance;

    /**
     * 账户红包余额
     */
    private BigDecimal coupon;

    /**
     * 红包有效期
     */
    private Date couponDeadline;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMediacyId() {
        return mediacyId;
    }

    public void setMediacyId(String mediacyId) {
        this.mediacyId = mediacyId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentMobile() {
        return agentMobile;
    }

    public void setAgentMobile(String agentMobile) {
        this.agentMobile = agentMobile;
    }

    public String getRecommendCustomer() {
        return recommendCustomer;
    }

    public void setRecommendCustomer(String recommendCustomer) {
        this.recommendCustomer = recommendCustomer;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
        return couponDeadline;
    }

    public void setCouponDeadline(Date couponDeadline) {
        this.couponDeadline = couponDeadline;
    }
}
