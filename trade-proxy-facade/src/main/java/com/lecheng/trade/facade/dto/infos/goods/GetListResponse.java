package com.lecheng.trade.facade.dto.infos.goods;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Goods;

import java.util.List;

/**
 * 功能: 获取商品列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 13:35
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -9010654129679693376L;

    /**
     * 商品列表
     */
    private List<Goods> goodsList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
