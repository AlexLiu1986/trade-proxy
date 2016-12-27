package com.lecheng.trade.facade.dto.deposits.test;

import com.lecheng.trade.facade.dto.BaseResponse;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 测试充值响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:52
 * 版本: V1.0
 */
public class PayResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6701823782980791890L;

    /**
     * 充值订单流水号
     */
    private long depositID;

    /**
     * 充值金额
     */
    private BigDecimal amount;

    /**
     * 充值时间
     */
    private Date depositTime;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Date depositTime) {
        this.depositTime = depositTime;
    }
}
