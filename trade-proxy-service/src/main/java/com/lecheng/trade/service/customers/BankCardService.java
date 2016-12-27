package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.customers.bankcard.GetListRequest;
import com.lecheng.trade.facade.dto.customers.bankcard.GetListResponse;

/**
 * 功能: 银行卡相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 17:43
 * 版本: V1.0
 */
public interface BankCardService {

    /**
     * 获取绑定银行卡列表
     *
     * @param req
     * @return
     */
    GetListResponse getList(GetListRequest req);
}
