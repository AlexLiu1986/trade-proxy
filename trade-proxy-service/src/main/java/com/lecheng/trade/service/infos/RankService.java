package com.lecheng.trade.service.infos;

import com.lecheng.trade.facade.dto.infos.rank.GetListRequest;
import com.lecheng.trade.facade.dto.infos.rank.GetListResponse;

/**
 * 功能: 排行榜服务
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:10
 * 版本: V1.0
 */
public interface RankService {

    /**
     * 查询排行榜
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);
}
