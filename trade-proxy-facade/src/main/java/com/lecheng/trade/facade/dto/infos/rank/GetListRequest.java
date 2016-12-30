package com.lecheng.trade.facade.dto.infos.rank;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 功能: 查询排行榜列表请求
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:14
 * 版本: V1.0
 */
public class GetListRequest implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -8135591861972820131L;

    /**
     * 类型(1-日榜,2-周榜,3-月榜)
     */
    @Range(min = 1, max = 3, message = "排行榜类型不正确")
    private int rankType;

    /**
     * 日期
     */
    @NotNull(message = "排行榜日期不能为空")
    private Date rankDay;

    public int getRankType() {
        return rankType;
    }

    public void setRankType(int rankType) {
        this.rankType = rankType;
    }

    public Date getRankDay() {
        return rankDay;
    }

    public void setRankDay(Date rankDay) {
        this.rankDay = rankDay;
    }
}
