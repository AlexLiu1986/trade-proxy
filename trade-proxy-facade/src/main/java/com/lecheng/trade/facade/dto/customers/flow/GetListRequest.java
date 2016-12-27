package com.lecheng.trade.facade.dto.customers.flow;

import com.lecheng.trade.facade.dto.SessionRequest;

/**
 * 功能: 获取账户流水列表请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:38
 * 版本: V1.0
 */
public class GetListRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -2330924503003445249L;

    /**
     * 流水类型,支持多个类型，以"|"连接,不传则查所有类型
     * (1:入金、2:出金、3:建仓、4:平仓、5:红包充值、6:系统错误、7:系统纠错、8:红包过期、9:商城消费
     */
    private String flowType;

    /**
     * 开始行数(按时间倒序，第一条为0，以此类推)
     */
    private int skip;

    /**
     * 获取行数
     */
    private int pageSize = 10;

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
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
