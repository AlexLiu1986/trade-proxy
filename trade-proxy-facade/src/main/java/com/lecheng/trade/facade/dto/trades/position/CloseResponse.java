package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Position;

/**
 * 功能: 平仓响应
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:53
 * 版本: V1.0
 */
public class CloseResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -8817182684505311651L;

    /**
     * 平仓仓位信息
     */
    private Position position;

    public CloseResponse() {
    }

    public CloseResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
