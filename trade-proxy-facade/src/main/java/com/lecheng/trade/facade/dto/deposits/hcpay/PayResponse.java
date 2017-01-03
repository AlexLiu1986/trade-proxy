package com.lecheng.trade.facade.dto.deposits.hcpay;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.HcPay;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 汇潮支付响应
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 11:48
 * 版本: V1.0
 */
public class PayResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 3939772008243962040L;

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
     * 汇潮返回信息
     */
    private HcPay hcPay;

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

    public HcPay getHcPay() {
        return hcPay;
    }

    public void setHcPay(HcPay hcPay) {
        this.hcPay = hcPay;
    }
}
