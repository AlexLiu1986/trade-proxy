package com.lecheng.trade.facade.dto;

import com.lecheng.trade.facade.exception.ParameterValidException;
import net.sf.json.JSONObject;

import java.io.Serializable;
import java.util.List;

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
     * 系统返回码
     */
    private int respCode;

    /**
     * 系统返回描述
     */
    private String respMsg;

    /**
     * 远程返回码
     */
    private String resultCD;

    /**
     * 远程错误消息
     */
    private String errorMsg;

    /**
     * 参数校验错误列表
     */
    List<ParameterValidException> parameterValidExceptions;

    public BaseResponse() {
    }

    public BaseResponse(int respCode, String respMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
    }

    public BaseResponse(int respCode, String respMsg, String resultCD, String errorMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.resultCD = resultCD;
        this.errorMsg = errorMsg;
    }

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

    public List<ParameterValidException> getParameterValidExceptions() {
        return parameterValidExceptions;
    }

    public void setParameterValidExceptions(List<ParameterValidException> parameterValidExceptions) {
        this.parameterValidExceptions = parameterValidExceptions;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public void setRemoteResultCD(String result) throws Exception {
        JSONObject object = JSONObject.fromObject(result);
        this.resultCD = object.getString("ResultCD");
        this.errorMsg = object.getString("ErrorMsg");
    }
}
