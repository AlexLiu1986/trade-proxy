package com.lecheng.trade.facade.dto;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 功能: 接口请求对象
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 10:11
 * 版本: V1.0
 */
public class ReqObj<T> implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6550283656754426828L;

    /**
     * 请求来源
     */
    @NotBlank(message = "请求来源渠道不能为空")
    private String source;

    /**
     * 数据
     */
    private T data;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
