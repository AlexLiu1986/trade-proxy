package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.ReqObj;
import com.lecheng.trade.facade.dto.RespObj;
import com.lecheng.trade.facade.dto.customers.regist.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.regist.GetVoiceVCodeRequest;

/**
 * 功能: 注册相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 14:17
 * 版本: V1.0
 */
public interface RegistService {

    /**
     * 获取注册短信验证码
     *
     * @param req
     * @return
     */
    RespObj<BaseResponse> getVCode(ReqObj<GetVCodeRequest> req);

    /**
     * 获取注册语音验证码
     *
     * @param req
     * @return
     */
    RespObj<BaseResponse> getVoiceVCode(ReqObj<GetVoiceVCodeRequest> req);
}
