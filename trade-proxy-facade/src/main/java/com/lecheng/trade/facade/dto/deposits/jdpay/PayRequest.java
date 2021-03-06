package com.lecheng.trade.facade.dto.deposits.jdpay;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 功能: 京东支付请求
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 11:39
 * 版本: V1.0
 */
public class PayRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -72823580012359326L;

    /**
     * 充值金额
     */
    @NotNull(message = "充值金额不能为空")
    @Digits(integer = 16, fraction = 2, message = "充值金额格式错误")
    @DecimalMin(value = "0.00", message = "充值金额不能为空")
    private BigDecimal money;

    /**
     * 支付完成后同步跳转地址
     */
    private String frontUrl;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getFrontUrl() {
        return frontUrl;
    }

    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }
}
