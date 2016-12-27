package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.customers.account.GetRequest;
import com.lecheng.trade.facade.dto.customers.account.GetResponse;

/**
 * 功能: 账户相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 10:13
 * 版本: V1.0
 */
public interface AccountService {

    /**
     * 查询账户信息
     *
     * @param req
     * @return
     */
    GetResponse get(GetRequest req);
}
