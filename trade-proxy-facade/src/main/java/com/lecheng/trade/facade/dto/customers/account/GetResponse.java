package com.lecheng.trade.facade.dto.customers.account;

import com.lecheng.trade.facade.dto.BaseResponse;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 获取账户信息响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 10:10
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -4457856911965789107L;

    /**
     * 登录账号
     */
    private String loginId;

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
    private Date couponDeadLine;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
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

    public Date getCouponDeadLine() {
        return couponDeadLine;
    }

    public void setCouponDeadLine(Date couponDeadLine) {
        this.couponDeadLine = couponDeadLine;
    }
}
