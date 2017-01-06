package com.lecheng.trade.dao.model;

import java.math.BigDecimal;

/**
 * 功能: 用户提现数据持久类
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 13:50
 * 版本: V1.0
 */
public class TradeWithdrawDo extends BaseDo {

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 提现流水ID
     */
    private Integer withdrawId;

    /**
     * 提现银行卡ID
     */
    private Integer bankCardId;

    /**
     * 提现金额
     */
    private BigDecimal money;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(Integer withdrawId) {
        this.withdrawId = withdrawId;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
