package com.lecheng.trade.service.deposits.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.deposits.test.PayRequest;
import com.lecheng.trade.facade.dto.deposits.test.PayResponse;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.deposits.TestService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 测试充值服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:56
 * 版本: V1.0
 */
@Service
public class TestServiceImpl extends BaseServiceImpl implements TestService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    /**
     * 测试充值
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "deposits/test/pay")
    public PayResponse pay(PayRequest req) {
        PayResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new PayResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setDepositID(JsonUtils.getLong(result, "DepositID"));
                response.setAmount(JsonUtils.getBigDecimal(result, "Amount"));
                response.setDepositTime(JsonUtils.getDate(result, "DepositTime"));
            }
        } catch (Exception e) {
            logger.error("测试充值失败", e);
            response = new PayResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
