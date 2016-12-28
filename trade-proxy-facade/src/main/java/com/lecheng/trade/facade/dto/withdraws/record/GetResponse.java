package com.lecheng.trade.facade.dto.withdraws.record;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Withdraw;

/**
 * 功能: 获取提现记录详情响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -9016320413050933288L;

    /**
     * 提现订单详情
     */
    private Withdraw withdraw;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Withdraw getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(Withdraw withdraw) {
        this.withdraw = withdraw;
    }
}
