package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.ReqObj;
import com.lecheng.trade.facade.dto.RespObj;
import com.lecheng.trade.facade.dto.customers.regist.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.regist.GetVoiceVCodeRequest;
import com.lecheng.trade.service.customers.RegistService;
import com.lecheng.trade.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能: 注册相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 14:17
 * 版本: V1.0
 */
@Service
public class RegistServiceImpl implements RegistService {

    /**
     * http通讯客户端
     */
    @Autowired
    private HttpClientUtils httpClient;

    /**
     * 获取注册短信验证码
     *
     * @param req
     * @return
     */
    @Override
    public RespObj<BaseResponse> getVCode(ReqObj<GetVCodeRequest> req) {
        httpClient.doPost("http://192.168.224.63:8080/sms-gateway/gateway/sendMessage", "");
        return null;
    }

    /**
     * 获取注册语音验证码
     *
     * @param req
     * @return
     */
    @Override
    public RespObj<BaseResponse> getVoiceVCode(ReqObj<GetVoiceVCodeRequest> req) {
        return null;
    }
}
