package com.lecheng.trade.service.infos;

import com.lecheng.trade.facade.dto.infos.rule.GetListResponse;

/**
 * 功能: 交易规则服务
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:05
 * 版本: V1.0
 */
public interface RuleService {

    /**
     * 获取交易规则列表
     *
     * @return
     */
    GetListResponse getList();
}
