package com.lecheng.trade.facade.dto.customers.unbinding;

import com.lecheng.trade.facade.dto.SessionRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 解绑卡请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:13
 * 版本: V1.0
 */
public class RemoveRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -4364173007112632622L;

    /**
     * 银行卡ID
     */
    @NotBlank(message = "银行卡不能为空")
    private int bankCardId;

    /**
     * 验证码
     */
    @NotBlank(message = "验证码不能为空")
    @Length(min = 6, max = 6, message = "验证码长度必须为6位")
    private String vcode;

    public int getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(int bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }
}
