package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.password.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.password.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.dto.customers.password.ResetRequest;
import com.lecheng.trade.facade.dto.customers.password.ResetResponse;
import com.lecheng.trade.service.customers.PasswordService;
import com.lecheng.trade.service.impl.BaseServiceImpl;
import com.lecheng.trade.utils.AesUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 密码相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 09:19
 * 版本: V1.0
 */
@Service
public class PasswordServiceImpl extends BaseServiceImpl implements PasswordService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(PasswordServiceImpl.class);

    /**
     * 获取注册短信验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/password/getvcode")
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
     * 获取注册语音验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/password/getvoicevcode")
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

    @Override
    @HttpRequest(name = "customers/password/reset")
    public ResetResponse reset(ResetRequest req) {
        ResetResponse response = null;
        try {
            req.setHashedPassword(AesUtils.encrypt(req.getHashedPassword(), AesUtils.AesKey));
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new ResetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (result != null) {
                response.setLoginId(result.getString("LoginId"));
            }
        } catch (Exception e) {
            logger.error("重置密码失败", e);
            response = new ResetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}