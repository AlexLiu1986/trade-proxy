package com.lecheng.trade.service.trades;

import com.lecheng.trade.facade.dto.trades.hisposition.GetListRequest;
import com.lecheng.trade.facade.dto.trades.hisposition.GetListResponse;
import com.lecheng.trade.facade.dto.trades.hisposition.GetRequest;
import com.lecheng.trade.facade.dto.trades.hisposition.GetResponse;

/**
 * 功能: 历史持仓相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 12:24
 * 版本: V1.0
 */
public interface HisPositionService {

    /**
     * 查询历史持仓列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);

    /**
     * 查询历史持仓详情
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
