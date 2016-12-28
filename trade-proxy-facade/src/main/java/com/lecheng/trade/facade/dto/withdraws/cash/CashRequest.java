package com.lecheng.trade.facade.dto.withdraws.cash;

import com.lecheng.trade.facade.dto.SessionRequest;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 功能: 提现请求
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 09:23
 * 版本: V1.0
 */
public class CashRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 79026001285414503L;

    /**
     * 提现金额
     */
    @NotNull(message = "提现金额不能为空")
    @Digits(integer = 16, fraction = 2, message = "提现金额格式错误")
    @DecimalMin(value = "0.00", message = "提现金额不能为空")
    private BigDecimal money;

    /**
     * 银行卡ID
     */
    @Min(value = 1, message = "提现银行卡不能为空")
    private int bankCardId;

    /**
     * 密码
     */
    @NotBlank(message = "登录密码不能为空")
    private String hashedPassword;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public int getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(int bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
