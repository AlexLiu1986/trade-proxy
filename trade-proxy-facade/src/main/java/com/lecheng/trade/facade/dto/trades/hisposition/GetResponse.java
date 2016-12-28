package com.lecheng.trade.facade.dto.trades.hisposition;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Position;

/**
 * 功能: 获取历史持仓详情响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 6859145665237073396L;

    /**
     * 历史持仓详情
     */
    private Position position;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
