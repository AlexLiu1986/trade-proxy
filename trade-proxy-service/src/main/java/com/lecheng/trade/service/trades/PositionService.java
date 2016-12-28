package com.lecheng.trade.service.trades;

import com.lecheng.trade.facade.dto.trades.position.*;

/**
 * 功能: 持仓相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:18
 * 版本: V1.0
 */
public interface PositionService {

    /**
     * 查询持仓列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);

    /**
     * 查询持仓详情
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);

    /**
     * 建仓
     *
     * @param req
     * @return
     */
    OpenResponse open(OpenRequest req);

    /**
     * 平仓
     *
     * @param req
     * @return
     */
    CloseResponse close(CloseRequest req);

    /**
     * 修改持仓
     *
     * @param req
     * @return
     */
    ModifyResponse modify(ModifyRequest req);

    /**
     * 获取仓位修改记录
     *
     * @param req
     * @return
     */
    UpdateLogResponse updateLog(UpdateLogRequest req);
}
