package com.lecheng.trade.facade.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 带有登录信息的请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:48
 * 版本: V1.0
 */
public class SessionRequest extends BaseRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -2134940984996640516L;

    /**
     * 登录账号
     */
    @NotBlank(message = "登录账号不能为空")
    @Length(min = 11, max = 11, message = "登录账号长度必须为11位")
    private String loginId;

    /**
     * 会话ID
     */
    @NotBlank(message = "会话ID不能为空")
    @Length(min = 1, max = 32, message = "会话ID长度不能超过32位")
    private String sessionId;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
