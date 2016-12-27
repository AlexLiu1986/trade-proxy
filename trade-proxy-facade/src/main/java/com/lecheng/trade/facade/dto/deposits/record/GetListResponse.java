package com.lecheng.trade.facade.dto.deposits.record;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Deposit;

import java.util.List;

/**
 * 功能: 获取充值记录列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -2706619210877822315L;

    /**
     * 充值记录列表
     */
    private List<Deposit> depositList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Deposit> getDepositList() {
        return depositList;
    }

    public void setDepositList(List<Deposit> depositList) {
        this.depositList = depositList;
    }
}
