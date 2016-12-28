package com.lecheng.trade.facade.dto.withdraws.record;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Min;

/**
 * 功能: 获取提现记录详情请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4044861310170386127L;

    /**
     * 提现订单流水号
     */
    @Min(value = 1, message = "提现订单流水号不能为空")
    private long withdrawID;

    public long getWithdrawID() {
        return withdrawID;
    }

    public void setWithdrawID(long withdrawID) {
        this.withdrawID = withdrawID;
    }
}
