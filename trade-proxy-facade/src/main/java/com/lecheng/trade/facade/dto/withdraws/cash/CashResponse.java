package com.lecheng.trade.facade.dto.withdraws.cash;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 提现响应
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 09:23
 * 版本: V1.0
 */
public class CashResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -4294026455863226686L;

    /**
     * 提现订单流水号
     */
    private long withdrawID;

    public CashResponse() {
    }

    public CashResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public long getWithdrawID() {
        return withdrawID;
    }

    public void setWithdrawID(long withdrawID) {
        this.withdrawID = withdrawID;
    }
}
