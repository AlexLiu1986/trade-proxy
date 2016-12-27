package com.lecheng.trade.facade.dto.deposits.test;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 功能: 测试充值请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:46
 * 版本: V1.0
 */
public class PayRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 6162539150859317615L;

    /**
     * 充值金额
     */
    @NotNull(message = "充值金额不能为空")
    @Digits(integer = 16, fraction = 2, message = "充值金额格式错误")
    @DecimalMin(value = "0.00", message = "充值金额不能为空")
    private BigDecimal money;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
