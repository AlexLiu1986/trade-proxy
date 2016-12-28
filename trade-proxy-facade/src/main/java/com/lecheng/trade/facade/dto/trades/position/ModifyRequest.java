package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.SessionRequest;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

/**
 * 功能: 修改持仓请求
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:58
 * 版本: V1.0
 */
public class ModifyRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 3038006691450442211L;

    /**
     * 待修改仓位ID
     */
    @Min(value = 1, message = "仓位ID不能为空")
    private long positionId;

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

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
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
