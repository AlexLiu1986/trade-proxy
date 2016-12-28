package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Position;

/**
 * 功能: 建仓响应
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:47
 * 版本: V1.0
 */
public class OpenResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -9021664548650686700L;

    /**
     * 新建仓位
     */
    private Position position;

    public OpenResponse() {
    }

    public OpenResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
