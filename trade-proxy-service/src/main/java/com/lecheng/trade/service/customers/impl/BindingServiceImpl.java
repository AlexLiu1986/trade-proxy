package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.binding.AddRequest;
import com.lecheng.trade.facade.dto.customers.binding.AddResponse;
import com.lecheng.trade.facade.dto.customers.binding.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.binding.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.model.Card;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.customers.BindingService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 绑卡相关服务实现类
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:09
 * 版本: V1.0
 */
@Service
public class BindingServiceImpl extends BaseServiceImpl implements BindingService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(BindingServiceImpl.class);

    /**
     * 获取绑卡短信验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/binding/getvcode")
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
     * 获取绑卡语音验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/binding/getvoicevcode")
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
     * 绑卡
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/binding/add")
    public AddResponse add(AddRequest req) {
        AddResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new AddResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setCard((Card) JsonUtils.toBean(JsonUtils.getJSONObject(result, "Card"), Card.class));
            }
        } catch (Exception e) {
            logger.error("绑卡错误", e);
            response = new AddResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
