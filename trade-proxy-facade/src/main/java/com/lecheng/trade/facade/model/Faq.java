package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 功能: 常见问题
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:58
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Faq implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 3911159811546210462L;

    /**
     * 流水号
     */
    @JsonProperty(value = "ID")
    private int id;

    /**
     * 问题
     */
    @JsonProperty(value = "Question")
    private String question;

    /**
     * 答案
     */
    @JsonProperty(value = "Answer")
    private String answer;

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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
