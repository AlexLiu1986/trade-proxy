package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.ReqObj;
import com.lecheng.trade.facade.dto.RespObj;
import com.lecheng.trade.facade.dto.customers.regist.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.regist.GetVoiceVCodeRequest;
import com.lecheng.trade.service.customers.RegistService;
import com.lecheng.trade.service.impl.BaseServiceImpl;
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
     * 获取注册短信验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/regist/getvcode")
    public RespObj<BaseResponse> getVCode(ReqObj<GetVCodeRequest> req) {
        httpClient.doPost(this.httpRequestUrl, "");
        return null;
    }

    /**
     * 获取注册语音验证码
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/regist/getvoicevcode")
    public RespObj<BaseResponse> getVoiceVCode(ReqObj<GetVoiceVCodeRequest> req) {
        httpClient.doPost(this.httpRequestUrl, "");
        return null;
    }
}
