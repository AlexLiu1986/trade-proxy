package com.lecheng.trade.facade.dto.customers.flow;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.AccountFlow;

import java.util.List;

/**
 * 功能: 获取账户流水列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:42
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -7088434349146577054L;

    /**
     * 账户流水列表
     */
    private List<AccountFlow> accountFlowList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<AccountFlow> getAccountFlowList() {
        return accountFlowList;
    }

    public void setAccountFlowList(List<AccountFlow> accountFlowList) {
        this.accountFlowList = accountFlowList;
    }
}
