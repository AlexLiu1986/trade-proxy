package com.lecheng.trade.facade.dto.deposits.record;

import com.lecheng.trade.facade.dto.SessionRequest;

/**
 * 功能: 获取充值记录列表请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetListRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -8254268278130171192L;

    /**
     * 支持多个状态，以"|"连接(1:处理中,2:成功,3:失败),不传则查所有状态
     */
    private String status;

    /**
     * 开始行数(按时间倒序，第一条为0，以此类推)
     */
    private int skip;

    /**
     * 获取行数
     */
    private int pageSize = 10;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
