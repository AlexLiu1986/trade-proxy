package com.lecheng.trade.facade.dto.customers.unbinding;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 解绑卡响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:18
 * 版本: V1.0
 */
public class RemoveResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4558642235990429707L;

    /**
     * 银行卡ID
     */
    private int bankCardId;

    public RemoveResponse() {
    }

    public RemoveResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public int getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(int bankCardId) {
        this.bankCardId = bankCardId;
    }
}
