package com.lecheng.trade.service.withdraws;

import com.lecheng.trade.facade.dto.withdraws.cash.CashRequest;
import com.lecheng.trade.facade.dto.withdraws.cash.CashResponse;

/**
 * 功能: 提现银行卡相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 09:21
 * 版本: V1.0
 */
public interface CashBankCardService {

    /**
     * 银行卡提现
     *
     * @param req
     * @return
     */
    CashResponse cash(CashRequest req);
}
