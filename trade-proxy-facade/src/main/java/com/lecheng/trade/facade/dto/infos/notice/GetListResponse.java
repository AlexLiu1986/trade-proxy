package com.lecheng.trade.facade.dto.infos.notice;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.model.Notice;

import java.util.List;

/**
 * 功能: 获取公告列表响应
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:00
 * 版本: V1.0
 */
public class GetListResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6763956304203612440L;

    /**
     * 公告列表
     */
    private List<Notice> noticeList;

    public GetListResponse() {
    }

    public GetListResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public List<Notice> getNoticeList() {
        return noticeList;
    }

    public void setNoticeList(List<Notice> noticeList) {
        this.noticeList = noticeList;
    }
}
