package com.lecheng.trade.facade.dto.deposits.record;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Min;

/**
 * 功能: 获取充值记录详情请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 813163918604038767L;

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
