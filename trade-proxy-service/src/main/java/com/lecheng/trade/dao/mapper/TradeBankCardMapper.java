package com.lecheng.trade.dao.mapper;

import com.lecheng.trade.dao.model.TradeBankCardDo;

import java.util.List;
import java.util.Map;

/**
 * 功能: 银行卡数据访问接口
 * 创建: liuchongguang
 * 日期: 2017/1/6 0006 11:16
 * 版本: V1.0
 */
public interface TradeBankCardMapper {

    /**
     * 查询单一结果
     *
     * @param tradeBankCardDo 查询参数
     * @return 数据持久对象
     */
    TradeBankCardDo select(TradeBankCardDo tradeBankCardDo);

    /**
     * 查询结果集
     *
     * @param tradeBankCardDo 查询参数
     * @return 数据持久对象结果集
     */
    List<TradeBankCardDo> selectList(TradeBankCardDo tradeBankCardDo);

    /**
     * 查询单一结果
     *
     * @param params 查询参数
     * @return 数据持久对象
     */
    TradeBankCardDo selectByMap(Map params);

    /**
     * 查询结果集
     *
     * @param params 查询参数
     * @return 数据持久对象结果集
     */
    List<TradeBankCardDo> selectListByMap(Map params);

    /**
     * 插入记录
     *
     * @param tradeBankCardDo 数据持久对象
     * @return 受影响行数
     */
    int insert(TradeBankCardDo tradeBankCardDo);

    /**
     * 根据ID删除记录
     *
     * @param id 记录ID
     * @return 受影响的行数
     */
    int delete(Integer id);
}
