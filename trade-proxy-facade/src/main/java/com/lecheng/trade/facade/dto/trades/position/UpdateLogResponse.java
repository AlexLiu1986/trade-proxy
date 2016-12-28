package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.PositionUpdate;

import java.util.List;

/**
 * 功能: 获取仓位修改记录响应
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 12:05
 * 版本: V1.0
 */
public class UpdateLogResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -2022107992323100943L;

    /**
     * 仓位修改记录
     */
    private List<PositionUpdate> positionUpdateLog;

    public UpdateLogResponse() {
    }

    public UpdateLogResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<PositionUpdate> getPositionUpdateLog() {
        return positionUpdateLog;
    }

    public void setPositionUpdateLog(List<PositionUpdate> positionUpdateLog) {
        this.positionUpdateLog = positionUpdateLog;
    }
}
