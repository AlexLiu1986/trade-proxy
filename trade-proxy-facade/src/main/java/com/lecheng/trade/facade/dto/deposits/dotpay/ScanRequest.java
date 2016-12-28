package com.lecheng.trade.facade.dto.deposits.dotpay;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 功能: 扫码充值请求
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 16:21
 * 版本: V1.0
 */
public class ScanRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -5780610395452074911L;

    /**
     * 客户端IP
     */
    @NotNull(message = "客户端IP不能为空")
    private String ip;

    /**
     * 充值金额
     */
    @NotNull(message = "充值金额不能为空")
    @Digits(integer = 16, fraction = 2, message = "充值金额格式错误")
    @DecimalMin(value = "0.00", message = "充值金额不能为空")
    private BigDecimal money;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
