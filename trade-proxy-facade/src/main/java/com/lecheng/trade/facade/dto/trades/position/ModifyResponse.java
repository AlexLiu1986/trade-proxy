package com.lecheng.trade.facade.dto.trades.position;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Position;

/**
 * 功能: 修改持仓响应
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:59
 * 版本: V1.0
 */
public class ModifyResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -989453901411232746L;

    /**
     * 修改后仓位信息
     */
    private Position position;

    public ModifyResponse() {
    }

    public ModifyResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
