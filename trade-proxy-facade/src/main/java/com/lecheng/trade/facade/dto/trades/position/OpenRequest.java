package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.SessionRequest;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 功能: 建仓请求
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:37
 * 版本: V1.0
 */
public class OpenRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -5701475048262784885L;

    /**
     * 商品代码
     */
    @NotBlank(message = "商品代码不能为空")
    private String code;

    /**
     * 买卖方向(1-买,2-卖)
     */
    @Range(min = 1, max = 2, message = "买卖方向不正确")
    private int bS;

    /**
     * 持仓手数
     */
    @NotNull(message = "持仓手数不能为空")
    @Digits(integer = 16, fraction = 2, message = "持仓手数格式错误")
    @DecimalMin(value = "0.00", message = "持仓手数不能为空")
    private BigDecimal amount;

    /**
     * 建仓价格
     */
    @NotNull(message = "建仓价格不能为空")
    @Digits(integer = 16, fraction = 2, message = "建仓价格格式错误")
    @DecimalMin(value = "0.00", message = "建仓价格不能为空")
    private BigDecimal openPrice;

    /**
     * 止盈(不设则为空)
     */
    private BigDecimal limit;

    /**
     * 止损(不设则为空)
     */
    private BigDecimal stop;

    /**
     * 是否持仓过夜(1-是,0-否)
     */
    @Range(min = 0, max = 1, message = "是否持仓过夜不正确")
    private int deferred;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getbS() {
        return bS;
    }

    public void setbS(int bS) {
        this.bS = bS;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getStop() {
        return stop;
    }

    public void setStop(BigDecimal stop) {
        this.stop = stop;
    }

    public int getDeferred() {
        return deferred;
    }

    public void setDeferred(int deferred) {
        this.deferred = deferred;
    }
}
