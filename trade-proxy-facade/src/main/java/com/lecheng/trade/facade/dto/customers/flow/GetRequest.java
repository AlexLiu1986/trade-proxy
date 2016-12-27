package com.lecheng.trade.facade.dto.customers.flow;

import com.lecheng.trade.facade.dto.SessionRequest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 功能: 查询账户流水详情请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:53
 * 版本: V1.0
 */
public class GetRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 4673989402012127205L;

    /**
     * 流水ID
     */
    @Min(value = 1, message = "流水ID不能为空")
    private long flowId;

    /**
     * 流水类型
     * (1:入金、2:出金、3:建仓、4:平仓、5:红包充值、6:系统错误、7:系统纠错、8:红包过期、9:商城消费
     */
    @Min(value = 1, message = "流水类型取值为1-9")
    @Max(value = 9, message = "流水类型取值为1-9")
    private int flowType;

    public long getFlowId() {
        return flowId;
    }

    public void setFlowId(long flowId) {
        this.flowId = flowId;
    }

    public int getFlowType() {
        return flowType;
    }

    public void setFlowType(int flowType) {
        this.flowType = flowType;
    }
}
