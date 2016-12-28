package com.lecheng.trade.facade.dto.trades.hisposition;

import com.lecheng.trade.facade.dto.SessionRequest;

/**
 * 功能: 获取历史持仓列表请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetListRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 8792186683734353010L;

    /**
     * 开始行数(按时间倒序，第一条为0，以此类推)
     */
    private int skip;

    /**
     * 获取行数
     */
    private int pageSize = 10;

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
