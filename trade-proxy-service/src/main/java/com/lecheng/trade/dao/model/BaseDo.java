package com.lecheng.trade.dao.model;

import java.util.Date;

/**
 * 功能: 数据持久类基类
 * 创建: liuchongguang
 * 日期: 2017/1/3 0003 13:45
 * 版本: V1.0
 */
public class BaseDo {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
