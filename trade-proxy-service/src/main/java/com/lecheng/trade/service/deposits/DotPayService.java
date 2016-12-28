package com.lecheng.trade.service.deposits;

import com.lecheng.trade.facade.dto.deposits.dotpay.ScanRequest;
import com.lecheng.trade.facade.dto.deposits.dotpay.ScanResponse;

/**
 * 功能: 点芯充值服务
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 16:26
 * 版本: V1.0
 */
public interface DotPayService {

    /**
     * 扫码充值
     *
     * @param req
     * @return
     */
    ScanResponse scan(ScanRequest req);
}
