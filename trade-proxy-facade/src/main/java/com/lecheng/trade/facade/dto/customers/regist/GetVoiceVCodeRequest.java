package com.lecheng.trade.facade.dto.customers.regist;

import com.lecheng.trade.facade.dto.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 获取注册语音验证码请求
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 10:08
 * 版本: V1.0
 */
public class GetVoiceVCodeRequest extends BaseRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6270178266371233703L;

    /**
     * 手机号码
     */
    @NotBlank(message = "手机号码不能为空")
    @Length(min = 11, max = 11, message = "手机号码长度必须为11位")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
