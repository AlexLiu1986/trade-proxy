package com.lecheng.trade.dao.mapper;

import com.lecheng.trade.dao.model.TradeWithdrawDo;

/**
 * 功能: 提现数据访问接口
 * 创建: liuchongguang
 * 日期: 2017/1/6 0006 11:51
 * 版本: V1.0
 */
public interface TradeWithdrawMapper {

    /**
     * 插入记录
     *
     * @param tradeWithdrawDo 数据持久对象
     * @return 受影响行数
     */
    int insert(TradeWithdrawDo tradeWithdrawDo);
}
