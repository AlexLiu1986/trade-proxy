package com.lecheng.trade.facade.dto.infos.faq;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Faq;

import java.util.List;

/**
 * 功能: 获取常见问题列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:00
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -3286773773329393131L;

    /**
     * 交易规则列表
     */
    private List<Faq> faqList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Faq> getFaqList() {
        return faqList;
    }

    public void setFaqList(List<Faq> faqList) {
        this.faqList = faqList;
    }
}
