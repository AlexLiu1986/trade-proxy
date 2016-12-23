package com.lecheng.trade.facade.dto;

import java.io.Serializable;

/**
 * 功能: 接口响应对象
 * 创建: liuchongguang
 * 日期: 2016/12/22 0022 17:27
 * 版本: V1.0
 */
public class RespObj<T> implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long SerialVersionUID = 1090474589474817015L;

    public RespObj() {
    }

    public RespObj(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public RespObj(int resultCode, String resultMsg, T data) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    /**
     * 响应码
     */
    private int resultCode;

    /**
     * 响应描述
     */
    private String resultMsg;

    /**
     * 数据
     */
    private T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
