package com.lecheng.trade.facade.dto.trades.hisposition;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Min;

/**
 * 功能: 获取历史持仓详情请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -324337885483418324L;


    /**
     * 仓位ID
     */
    @Min(value = 1, message = "仓位ID不能为空")
    private long positionId;

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }
}
