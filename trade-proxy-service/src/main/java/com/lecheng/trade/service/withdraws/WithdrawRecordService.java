package com.lecheng.trade.service.withdraws;

import com.lecheng.trade.facade.dto.withdraws.record.GetListRequest;
import com.lecheng.trade.facade.dto.withdraws.record.GetListResponse;
import com.lecheng.trade.facade.dto.withdraws.record.GetRequest;
import com.lecheng.trade.facade.dto.withdraws.record.GetResponse;

/**
 * 功能: 提现记录相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 10:54
 * 版本: V1.0
 */
public interface WithdrawRecordService {

    /**
     * 查询提现记录列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);

    /**
     * 查询提现详情
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
