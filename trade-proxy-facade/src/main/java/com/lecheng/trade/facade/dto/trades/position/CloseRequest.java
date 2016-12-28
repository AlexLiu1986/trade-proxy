package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

/**
 * 功能: 平仓请求
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:51
 * 版本: V1.0
 */
public class CloseRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 2692386818792078311L;

    /**
     * 待平仓位ID
     */
    @Min(value = 1, message = "仓位ID不能为空")
    private long positionId;

    /**
     * 平仓价格(为空则按服务器价格成交)
     */
    private BigDecimal price;

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
