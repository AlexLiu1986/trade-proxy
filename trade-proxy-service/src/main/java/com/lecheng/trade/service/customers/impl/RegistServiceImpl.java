package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.regist.AddRequest;
import com.lecheng.trade.facade.dto.customers.regist.AddResponse;
import com.lecheng.trade.facade.dto.customers.regist.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.regist.GetVoiceVCodeRequest;
import com.lecheng.trade.service.customers.RegistService;
import com.lecheng.trade.service.impl.BaseServiceImpl;
import com.lecheng.trade.utils.AesUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 注册相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 14:17
 * 版本: V1.0
 */
@Service
public class RegistServiceImpl extends BaseServiceImpl implements RegistService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(RegistServiceImpl.class);

    /**
     * 获取注册短信验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/regist/getvcode")
    public BaseResponse getVCode(GetVCodeRequest req) {
        BaseResponse response = null;
        try {
            String result = httpClient.doPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
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
    @HttpRequest(name = "customers/regist/getvoicevcode")
    public BaseResponse getVoiceVCode(GetVoiceVCodeRequest req) {
        BaseResponse response = null;
        try {
            String result = httpClient.doPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new BaseResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
        } catch (Exception e) {
            logger.error("获取语音验证码错误", e);
            response = new BaseResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 注册
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/regist/add")
    public AddResponse add(AddRequest req) {
        AddResponse response = null;
        try {
            //req.setHashedPassword(AesUtils.encrypt(req.getHashedPassword(), AesUtils.AesKey));
            String result = httpClient.doPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new AddResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
        } catch (Exception e) {
            logger.error("用户注册失败", e);
            response = new AddResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
