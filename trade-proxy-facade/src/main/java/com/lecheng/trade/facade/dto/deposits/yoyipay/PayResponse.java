package com.lecheng.trade.facade.dto.deposits.yoyipay;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.JdPay;
import com.lecheng.trade.facade.model.YoyiPay;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 甬易充值响应
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 11:48
 * 版本: V1.0
 */
public class PayResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -5680551393055871813L;

    /**
     * 充值订单流水
     */
    private long depositID;

    /**
     * 充值时间
     */
    private Date depositTime;

    /**
     * 充值金额
     */
    private BigDecimal amount;

    /**
     * 甬易返回信息
     */
    private YoyiPay yoyiPay;

    public PayResponse() {
    }

    public PayResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public long getDepositID() {
        return depositID;
    }

    public void setDepositID(long depositID) {
        this.depositID = depositID;
    }

    public Date getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Date depositTime) {
        this.depositTime = depositTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public YoyiPay getYoyiPay() {
        return yoyiPay;
    }

    public void setYoyiPay(YoyiPay yoyiPay) {
        this.yoyiPay = yoyiPay;
    }
}
