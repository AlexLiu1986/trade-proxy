package com.lecheng.trade.service.infos;

import com.lecheng.trade.facade.dto.infos.goods.GetListRequest;
import com.lecheng.trade.facade.dto.infos.goods.GetListResponse;

/**
 * 功能: 商品服务
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 13:30
 * 版本: V1.0
 */
public interface GoodsService {

    /**
     * 获取商品列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);
}
