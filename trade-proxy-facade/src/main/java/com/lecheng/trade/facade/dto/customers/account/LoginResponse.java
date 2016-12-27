package com.lecheng.trade.facade.dto.customers.account;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 登录响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 12:29
 * 版本: V1.0
 */
public class LoginResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4092237083328445836L;

    /**
     * 会话ID
     */
    private String sessionId;

    public LoginResponse() {
    }

    public LoginResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
