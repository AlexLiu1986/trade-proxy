package com.lecheng.trade.facade.dto.customers.binding;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Card;

/**
 * 功能: 绑卡响应
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:18
 * 版本: V1.0
 */
public class AddResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -3728687830655558463L;

    /**
     * 银行卡信息
     */
    private Card card;

    public AddResponse() {
    }

    public AddResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
