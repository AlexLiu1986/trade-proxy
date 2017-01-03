package com.lecheng.trade.facade.dto.deposits.jdpay;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Min;

/**
 * 功能: 京东充值查询请求
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:12
 * 版本: V1.0
 */
public class VerifyRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -8941035595248916146L;

    /**
     * 充值订单流水号
     */
    @Min(value = 1, message = "充值订单流水号不能为空")
    private long depositID;

    public long getDepositID() {
        return depositID;
    }

    public void setDepositID(long depositID) {
        this.depositID = depositID;
    }
}
