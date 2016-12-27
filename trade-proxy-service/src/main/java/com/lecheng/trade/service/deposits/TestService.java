package com.lecheng.trade.service.deposits;

import com.lecheng.trade.facade.dto.deposits.test.PayRequest;
import com.lecheng.trade.facade.dto.deposits.test.PayResponse;

/**
 * 功能: 测试充值服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:44
 * 版本: V1.0
 */
public interface TestService {

    /**
     * 测试充值
     *
     * @param req
     * @return
     */
    PayResponse pay(PayRequest req);
}
