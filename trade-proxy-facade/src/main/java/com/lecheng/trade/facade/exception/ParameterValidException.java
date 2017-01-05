package com.lecheng.trade.facade.exception;

import java.io.Serializable;

/**
 * 功能: 参加校验异常
 * 创建: liuchongguang
 * 日期: 2016/12/22 0022 17:32
 * 版本: V1.0
 */
public class ParameterValidException implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 1298739505166783674L;

    public ParameterValidException() {
    }

    public ParameterValidException(String parameter, String error) {
        this.parameter = parameter;
        this.error = error;
    }

    /**
     * 错误字段
     */
    private String parameter;

    /**
     * 错误描述
     */
    private String error;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
