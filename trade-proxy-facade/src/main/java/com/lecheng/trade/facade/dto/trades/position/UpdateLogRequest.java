package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Min;

/**
 * 功能: 获取仓位修改记录请求
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 12:04
 * 版本: V1.0
 */
public class UpdateLogRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6042855658623700875L;

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
