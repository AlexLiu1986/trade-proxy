package com.lecheng.trade.service.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.password.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.password.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.dto.customers.password.ResetRequest;
import com.lecheng.trade.facade.dto.customers.password.ResetResponse;

/**
 * 功能: 密码相关服务
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 09:17
 * 版本: V1.0
 */
public interface PasswordService {

    /**
     * 获取重置密码短信验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVCode(GetVCodeRequest req);

    /**
     * 获取重置密码语音验证码
     *
     * @param req
     * @return
     */
    BaseResponse getVoiceVCode(GetVoiceVCodeRequest req);

    /**
     * 重置密码
     *
     * @param req
     * @return
     */
    ResetResponse reset(ResetRequest req);
}
