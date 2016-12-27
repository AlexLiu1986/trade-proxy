package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.unbinding.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.RemoveRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.RemoveResponse;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.customers.UnbindingService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 解绑卡相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:29
 * 版本: V1.0
 */
@Service
public class UnbindingServiceImpl extends BaseServiceImpl implements UnbindingService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(BindingServiceImpl.class);

    /**
     * 获取解绑卡短信验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/unbinding/getvcode")
    public BaseResponse getVCode(GetVCodeRequest req) {
        BaseResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new BaseResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
        } catch (Exception e) {
            logger.error("获取短信验证码错误", e);
            response = new BaseResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 获取解绑卡语音验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/unbinding/getvoicevcode")
    public BaseResponse getVoiceVCode(GetVoiceVCodeRequest req) {
        BaseResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new BaseResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
        } catch (Exception e) {
            logger.error("获取语音验证码错误", e);
            response = new BaseResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 解绑卡
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/unbinding/remove")
    public RemoveResponse remove(RemoveRequest req) {
        RemoveResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new RemoveResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setBankCardId(JsonUtils.getInt(result, "BankCardId"));
            }
        } catch (Exception e) {
            logger.error("获取语音验证码错误", e);
            response = new RemoveResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
