package com.lecheng.trade.facade.constants;

/**
 * 功能: 远程响应码
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 12:05
 * 版本: V1.0
 */
public enum ResultCD {

    SUCC("I001", "成功");

    /**
     * 返回码
     */
    private String value;

    /**
     * 返回描述
     */
    private String desc;

    ResultCD(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
