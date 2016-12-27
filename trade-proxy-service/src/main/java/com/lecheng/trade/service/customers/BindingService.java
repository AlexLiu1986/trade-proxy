package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.binding.AddRequest;
import com.lecheng.trade.facade.dto.customers.binding.AddResponse;
import com.lecheng.trade.facade.dto.customers.binding.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.binding.GetVoiceVCodeRequest;

/**
 * 功能: 绑卡相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 17:44
 * 版本: V1.0
 */
public interface BindingService {

    /**
     * 获取绑卡短信验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVCode(GetVCodeRequest req);

    /**
     * 获取绑卡语音验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVoiceVCode(GetVoiceVCodeRequest req);

    /**
     * 绑卡
     *
     * @param req
     * @return
     */
    AddResponse add(AddRequest req);
}
