package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.regist.AddRequest;
import com.lecheng.trade.facade.dto.customers.regist.AddResponse;
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
    BaseResponse getVCode(GetVCodeRequest req);

    /**
     * 获取注册语音验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVoiceVCode(GetVoiceVCodeRequest req);

    /**
     * 注册
     *
     * @param req
     * @return
     */
    AddResponse add(AddRequest req);
}
