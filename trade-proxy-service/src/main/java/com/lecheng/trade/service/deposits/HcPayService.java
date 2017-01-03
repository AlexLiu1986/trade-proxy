package com.lecheng.trade.service.deposits;

import com.lecheng.trade.facade.dto.deposits.hcpay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.hcpay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.hcpay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.hcpay.VerifyResponse;

/**
 * 功能: 汇潮支付服务
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 10:53
 * 版本: V1.0
 */
public interface HcPayService {

    /**
     * 汇潮充值
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
