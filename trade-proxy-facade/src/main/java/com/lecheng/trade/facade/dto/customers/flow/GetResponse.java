package com.lecheng.trade.facade.dto.customers.flow;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.AccountFlowDetail;

/**
 * 功能: 查询账户流水详情响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:53
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4751531975924324717L;

    /**
     * 账户流水详情
     */
    private AccountFlowDetail accountFlowDetail;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public AccountFlowDetail getAccountFlowDetail() {
        return accountFlowDetail;
    }

    public void setAccountFlowDetail(AccountFlowDetail accountFlowDetail) {
        this.accountFlowDetail = accountFlowDetail;
    }
}
