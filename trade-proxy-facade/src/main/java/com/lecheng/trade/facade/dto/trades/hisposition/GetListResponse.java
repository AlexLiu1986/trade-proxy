package com.lecheng.trade.facade.dto.trades.hisposition;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Position;

import java.util.List;

/**
 * 功能: 获取历史持仓列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -309921374800518305L;

    /**
     * 历史持仓列表
     */
    private List<Position> positionList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Position> getPositionList() {
        return positionList;
    }

    public void setPositionList(List<Position> positionList) {
        this.positionList = positionList;
    }
}
