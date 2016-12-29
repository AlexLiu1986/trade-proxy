package com.lecheng.trade.service.prices;

import com.lecheng.trade.facade.dto.prices.realtime.GetListResponse;

/**
 * 功能: 报价服务
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:08
 * 版本: V1.0
 */
public interface RealTimeService {

    /**
     * 查询报价
     *
     * @param goodsType
     * @return
     */
    GetListResponse getList(String goodsType);
}
