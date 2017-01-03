package com.lecheng.trade.facade.dto.deposits.easypay;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 易生充值查询响应
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:13
 * 版本: V1.0
 */
public class VerifyResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -3949914113776394970L;

    /**
     * 充值订单流水号
     */
    private long depositID;

    /**
     * 订单状态（2 支付成功 | 3 支付失败 | 其他待定）
     */
    private int depositStatus;

    public VerifyResponse() {
    }

    public VerifyResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public long getDepositID() {
        return depositID;
    }

    public void setDepositID(long depositID) {
        this.depositID = depositID;
    }

    public int getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(int depositStatus) {
        this.depositStatus = depositStatus;
    }
}
