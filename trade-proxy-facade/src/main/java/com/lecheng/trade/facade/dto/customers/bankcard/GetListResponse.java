package com.lecheng.trade.facade.dto.customers.bankcard;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.AccountFlow;
import com.lecheng.trade.facade.model.Card;

import java.util.List;

/**
 * 功能: 获取绑定银行卡列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:42
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 8524872488772477178L;

    /**
     * 银行卡列表
     */
    private List<Card> cardList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }
}
