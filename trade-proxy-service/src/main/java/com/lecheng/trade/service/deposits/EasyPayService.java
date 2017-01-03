package com.lecheng.trade.service.deposits;

import com.lecheng.trade.facade.dto.deposits.easypay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.easypay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.easypay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.easypay.VerifyResponse;

/**
 * 功能: 易生支付服务
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 10:53
 * 版本: V1.0
 */
public interface EasyPayService {

    /**
     * 易生充值
     *
     * @param req
     * @return
     */
    PayResponse pay(PayRequest req);

    /**
     * 充值订单查询
     *
     * @param req
     * @return
     */
    VerifyResponse verify(VerifyRequest req);
}
