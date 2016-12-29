package com.lecheng.trade.facade.dto.prices.realtime;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Price;

import java.util.List;

/**
 * 功能: 查询报价响应
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:21
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -3781617799505771080L;

    /**
     * 报价列表
     */
    private List<Price> priceList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }
}
