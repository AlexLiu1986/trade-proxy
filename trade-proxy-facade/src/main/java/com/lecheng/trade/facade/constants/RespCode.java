package com.lecheng.trade.facade.constants;

/**
 * 功能: 系统返回码
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 13:44
 * 版本: V1.0
 */
public enum RespCode {

    SUCC(200, "成功"),

    FAIL(400, "失败"),

    REQUEST_PARAMS_VALID_ERROR(401, "请求参数校验错误");

    /**
     * 返回码
     */
    private int value;

    /**
     * 返回描述
     */
    private String desc;

    RespCode(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
