package com.lecheng.trade.facade.dto;

import java.io.Serializable;

/**
 * 功能: 基础响应独享
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 10:18
 * 版本: V1.0
 */
public class BaseResponse implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -524016558688799245L;

    /**
     * 返回码
     */
    private String resultCD;

    /**
     * 错误消息
     */
    private String errorMsg;

    public String getResultCD() {
        return resultCD;
    }

    public void setResultCD(String resultCD) {
        this.resultCD = resultCD;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
