package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.customers.flow.GetListRequest;
import com.lecheng.trade.facade.dto.customers.flow.GetListResponse;
import com.lecheng.trade.facade.dto.customers.flow.GetRequest;
import com.lecheng.trade.facade.dto.customers.flow.GetResponse;

/**
 * 功能: 账户流水相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:45
 * 版本: V1.0
 */
public interface FlowService {

    /**
     * 获取账户流水列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);

    /**
     * 获取账户流水详情
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
