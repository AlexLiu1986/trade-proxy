package com.lecheng.trade.facade.dto.prices.timeline;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.PriceKChart;

import java.util.List;

/**
 * 功能: 查询分时线响应
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:21
 * 版本: V1.0
 */
public class GetResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -3165018193091426815L;

    /**
     * 当日分时线数据
     */
    private List<PriceKChart> priceItemList;

    public GetResponse() {
    }

    public GetResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<PriceKChart> getPriceItemList() {
        return priceItemList;
    }

    public void setPriceItemList(List<PriceKChart> priceItemList) {
        this.priceItemList = priceItemList;
    }
}
