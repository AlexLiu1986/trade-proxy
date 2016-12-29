package com.lecheng.trade.service.withdraws.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.withdraws.cash.CashRequest;
import com.lecheng.trade.facade.dto.withdraws.cash.CashResponse;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.withdraws.CashBankCardService;
import com.lecheng.trade.utils.AesUtils;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 提现银行卡相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 09:30
 * 版本: V1.0
 */
@Service
public class CashBankCardServiceImpl extends BaseServiceImpl implements CashBankCardService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(CashBankCardServiceImpl.class);

    /**
     * 银行卡提现
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "withdraws/bankcard/cash")
    public CashResponse cash(CashRequest req) {
        CashResponse response = null;
        try {
            req.setHashedPassword(AesUtils.encrypt(req.getHashedPassword(), AesUtils.AesKey));
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new CashResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setWithdrawID(JsonUtils.getLong(result, "WithdrawID"));
            }
        } catch (Exception e) {
            logger.error("银行卡提现失败", e);
            response = new CashResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
