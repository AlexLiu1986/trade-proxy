package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.unbinding.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.RemoveRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.RemoveResponse;

/**
 * 功能: 解绑卡相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 17:44
 * 版本: V1.0
 */
public interface UnbindingService {

    /**
     * 获取解绑卡短信验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVCode(GetVCodeRequest req);

    /**
     * 获取解绑卡语音验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVoiceVCode(GetVoiceVCodeRequest req);

    /**
     * 解绑卡
     *
     * @param req
     * @return
     */
    RemoveResponse remove(RemoveRequest req);
}
