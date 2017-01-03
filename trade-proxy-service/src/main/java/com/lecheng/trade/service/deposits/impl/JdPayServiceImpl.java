package com.lecheng.trade.service.deposits.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.deposits.jdpay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.jdpay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.jdpay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.jdpay.VerifyResponse;
import com.lecheng.trade.facade.model.JdPay;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.deposits.JdPayService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 京东支付服务实现
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 11:56
 * 版本: V1.0
 */
@Service
public class JdPayServiceImpl extends BaseServiceImpl implements JdPayService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(JdPayServiceImpl.class);

    /**
     * 充值
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "deposits/jdpay/pay")
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
                JdPay jdPay = JsonUtils.toBean(result, JdPay.class);
                response.setJdPay(jdPay);
            }
        } catch (Exception e) {
            logger.error("京东充值失败", e);
            response = new PayResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 充值订单查询
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "deposits/jdpay/verify")
    public VerifyResponse verify(VerifyRequest req) {
        VerifyResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new VerifyResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setDepositID(JsonUtils.getLong(result, "DepositID"));
                response.setDepositStatus(JsonUtils.getInt(result, "DepositStatus"));
            }
        } catch (Exception e) {
            logger.error("京东充值订单查询失败", e);
            response = new VerifyResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
