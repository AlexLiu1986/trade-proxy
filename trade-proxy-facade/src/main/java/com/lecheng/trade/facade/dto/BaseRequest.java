package com.lecheng.trade.facade.dto;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 功能: 基础请求对象
 * 创建: liuchongguang
 * 日期: 2016/12/22 0022 15:32
 * 版本: V1.0
 */
public class BaseRequest implements Serializable {

    /**
     * 防止二次提交用32位guid
     */
    @NotBlank(message = "Guid不能为空")
    @Length(min = 32, max = 32, message = "Guid长度必须为32位")
    private String guid;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
