package com.lecheng.trade.facade.dto.withdraws.record;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Withdraw;

import java.util.List;

/**
 * 功能: 获取提现记录列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -1133605923788164877L;

    /**
     * 提现记录列表
     */
    private List<Withdraw> withdrawList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Withdraw> getWithdrawList() {
        return withdrawList;
    }

    public void setWithdrawList(List<Withdraw> withdrawList) {
        this.withdrawList = withdrawList;
    }
}
