package com.lecheng.trade.facade.dto.infos.rank;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Rank;

import java.util.List;

/**
 * 功能: 查询排行榜列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:14
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 652335412773915767L;

    /**
     * 排行榜列表
     */
    private List<Rank> rankList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Rank> getRankList() {
        return rankList;
    }

    public void setRankList(List<Rank> rankList) {
        this.rankList = rankList;
    }
}
