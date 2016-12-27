package com.lecheng.trade.facade.dto.customers.password;

import com.lecheng.trade.facade.dto.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 重置密码请求
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 15:56
 * 版本: V1.0
 */
public class ResetRequest extends BaseRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4217320272306513610L;

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
     * 验证码
     */
    @NotBlank(message = "验证码不能为空")
    @Length(min = 6, max = 6, message = "验证码长度必须为6位")
    private String vcode;

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

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }
}
