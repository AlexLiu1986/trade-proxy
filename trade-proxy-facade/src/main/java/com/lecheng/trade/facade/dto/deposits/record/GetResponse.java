package com.lecheng.trade.facade.dto.deposits.record;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Deposit;

/**
 * 功能: 获取充值记录详情响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6324413198752155105L;

    /**
     * 充值订单详情
     */
    private Deposit deposit;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }
}
