package com.lecheng.trade.service.prices;

import com.lecheng.trade.facade.dto.prices.markettime.GetRequest;
import com.lecheng.trade.facade.dto.prices.markettime.GetResponse;

/**
 * 功能: 交易时间服务
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 14:10
 * 版本: V1.0
 */
public interface MarketTimeService {

    /**
     * 查询交易时间
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
