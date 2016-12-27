package com.lecheng.trade.facade.dto.customers.password;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 重置密码响应
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 16:05
 * 版本: V1.0
 */
public class ResetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -4924298769786672992L;

    /**
     * 登录账号
     */
    private String loginId;

    public ResetResponse() {
    }

    public ResetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
}
