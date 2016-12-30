package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 交易规则
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:58
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rule implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -1079144671703067720L;

    /**
     * 流水号
     */
    @JsonProperty(value = "ID")
    private int id;

    /**
     * 标题
     */
    @JsonProperty(value = "Title")
    private String title;

    /**
     * 内容
     */
    @JsonProperty(value = "Content")
    private String content;

    /**
     * 排序
     */
    @JsonProperty(value = "Sort")
    private int sort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
