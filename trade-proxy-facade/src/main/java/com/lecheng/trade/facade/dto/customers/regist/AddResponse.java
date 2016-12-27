package com.lecheng.trade.facade.dto.customers.regist;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 注册响应
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 16:05
 * 版本: V1.0
 */
public class AddResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 6193070027341114833L;

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 登录账号
     */
    private String loginId;

    public AddResponse() {
    }

    public AddResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
}
