package com.lecheng.trade.facade.dto.infos.rule;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Rule;

import java.util.List;

/**
 * 功能: 获取交易规则列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:00
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -2191516787087722081L;

    /**
     * 交易规则列表
     */
    private List<Rule> ruleList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Rule> getRuleList() {
        return ruleList;
    }

    public void setRuleList(List<Rule> ruleList) {
        this.ruleList = ruleList;
    }
}
