package com.lecheng.trade.service.prices;

import com.lecheng.trade.facade.dto.prices.kchart.GetRequest;
import com.lecheng.trade.facade.dto.prices.kchart.GetResponse;

/**
 * 功能: K线服务
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 11:44
 * 版本: V1.0
 */
public interface KChartService {

    /**
     * 获取K线数据
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
