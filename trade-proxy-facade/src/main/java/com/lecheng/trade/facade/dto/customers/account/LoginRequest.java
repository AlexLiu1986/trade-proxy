package com.lecheng.trade.facade.dto.customers.account;

import com.lecheng.trade.facade.dto.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 登录请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 12:28
 * 版本: V1.0
 */
public class LoginRequest extends BaseRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -2528938922225807726L;

    /**
     * 登录账号
     */
    @NotBlank(message = "登录账号不能为空")
    @Length(min = 11, max = 11, message = "登录账号长度必须为11位")
    private String loginId;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String hashedPassword;

    /**
     * IP地址
     */
    private String ip;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
