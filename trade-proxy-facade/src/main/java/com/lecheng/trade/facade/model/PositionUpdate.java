package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能: 仓位修改记录
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 12:06
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionUpdate implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 5507858127129147233L;

    /**
     * 持仓流水号
     */
    @JsonProperty(value = "ID")
    private long id;

    /**
     * 止盈(不设则为空)
     */
    @JsonProperty(value = "Limit")
    private BigDecimal limit;

    /**
     * 止损(不设则为空)
     */
    @JsonProperty(value = "Stop")
    private BigDecimal stop;

    /**
     * 是否过夜
     */
    @JsonProperty(value = "IsDeferred")
    private int isDeferred;

    /**
     * 修改时间
     */
    @JsonProperty(value = "UpdateTime")
    private String updateTime;

    /**
     * 修改时登录IP
     */
    @JsonProperty(value = "IPAddress")
    private String ipAddress;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getStop() {
        return stop;
    }

    public void setStop(BigDecimal stop) {
        this.stop = stop;
    }

    public int getIsDeferred() {
        return isDeferred;
    }

    public void setIsDeferred(int isDeferred) {
        this.isDeferred = isDeferred;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
