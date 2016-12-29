package com.lecheng.trade.service.prices;

import com.lecheng.trade.facade.dto.prices.timeline.GetRequest;
import com.lecheng.trade.facade.dto.prices.timeline.GetResponse;

/**
 * 功能: 分时线服务
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 13:35
 * 版本: V1.0
 */
public interface TimeLineService {

    /**
     * 查询分时线
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
