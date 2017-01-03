package com.lecheng.trade.service.deposits;

import com.lecheng.trade.facade.dto.deposits.yoyipay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.yoyipay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.yoyipay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.yoyipay.VerifyResponse;

/**
 * 功能: 甬易充值服务
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 12:20
 * 版本: V1.0
 */
public interface YoyiPayService {

    /**
     * 充值
     *
     * @param req
     * @return
     */
    PayResponse pay(PayRequest req);

    /**
     * 甬易充值(匿名通道)
     *
     * @param req
     * @return
     */
    PayResponse anonymouspay(PayRequest req);

    /**
     * 充值订单查询
     *
     * @param req
     * @return
     */
    VerifyResponse verify(VerifyRequest req);
}
