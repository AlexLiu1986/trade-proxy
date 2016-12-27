package com.lecheng.trade.service.deposits;

import com.lecheng.trade.facade.dto.deposits.record.GetListRequest;
import com.lecheng.trade.facade.dto.deposits.record.GetListResponse;
import com.lecheng.trade.facade.dto.deposits.record.GetRequest;
import com.lecheng.trade.facade.dto.deposits.record.GetResponse;

/**
 * 功能: 充值记录服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:44
 * 版本: V1.0
 */
public interface RecordService {

    /**
     * 查询充值列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);

    /**
     * 查询充值详情
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
