package com.lecheng.trade.dao.mapper;

import com.lecheng.trade.dao.model.TradeCustomerDo;

import java.util.List;
import java.util.Map;

/**
 * 功能: 会员数据访问接口
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 13:59
 * 版本: V1.0
 */
public interface TradeCustomerMapper {

    /**
     * 查询单一结果
     *
     * @param tradeCustomerDo 查询参数
     * @return 数据持久对象
     */
    TradeCustomerDo select(TradeCustomerDo tradeCustomerDo);

    /**
     * 查询结果集
     *
     * @param tradeCustomerDo 查询参数
     * @return 数据持久对象结果集
     */
    List<TradeCustomerDo> selectList(TradeCustomerDo tradeCustomerDo);

    /**
     * 查询单一结果
     *
     * @param params 查询参数
     * @return 数据持久对象
     */
    TradeCustomerDo selectByMap(Map params);

    /**
     * 查询结果集
     *
     * @param params 查询参数
     * @return 数据持久对象结果集
     */
    List<TradeCustomerDo> selectListByMap(Map params);

    /**
     * 插入记录
     *
     * @param tradeCustomerDo 数据持久对象
     * @return 受影响行数
     */
    int insert(TradeCustomerDo tradeCustomerDo);

    /**
     * 更新记录
     *
     * @param tradeCustomerDo 数据持久对象
     * @return 受影响行数
     */
    int update(TradeCustomerDo tradeCustomerDo);
}
