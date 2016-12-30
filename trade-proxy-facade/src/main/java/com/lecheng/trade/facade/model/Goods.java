package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 功能: 商品
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 13:31
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Goods implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -6513931656023605266L;

    /**
     * 商品代码
     */
    @JsonProperty(value = "Code")
    private String code;

    /**
     * 商品名称
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * 商品类型(吉银、吉油、吉咖啡)
     */
    @JsonProperty(value = "TypeCode")
    private String typeCode;

    /**
     * 商品单位描述
     */
    @JsonProperty(value = "Weight")
    private String weight;

    /**
     * 每手数量(按报价单位计算) *1
     */
    @JsonProperty(value = "AmountPerLot")
    private BigDecimal amountPerLot;

    /**
     * 波动盈亏 *2
     */
    @JsonProperty(value = "ProfitPerUnit")
    private BigDecimal profitPerUnit;

    /**
     * 建仓保证金 *3
     */
    @JsonProperty(value = "DepositFee")
    private BigDecimal depositFee;

    /**
     * 建仓手续费 *4
     */
    @JsonProperty(value = "OpenChargeFee")
    private BigDecimal openChargeFee;

    /**
     * 平仓手续费 *5
     */
    @JsonProperty(value = "CloseChargeFee")
    private BigDecimal closeChargeFee;

    /**
     * 过夜费 *6
     */
    @JsonProperty(value = "DeferredFee")
    private BigDecimal deferredFee;

    /**
     * 最大持仓手数
     */
    @JsonProperty(value = "MaxLot")
    private int maxLot;

    /**
     * 最小下单手数(默认为1)
     */
    @JsonProperty(value = "MinLot")
    private int minLot = 1;

    /**
     * 商品状态(1-正常,2-暂停交易)
     */
    @JsonProperty(value = "Status")
    private int status = 1;

    /**
     * 排序
     */
    @JsonProperty(value = "Sort")
    private int sort = 1;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public BigDecimal getAmountPerLot() {
        return amountPerLot;
    }

    public void setAmountPerLot(BigDecimal amountPerLot) {
        this.amountPerLot = amountPerLot;
    }

    public BigDecimal getProfitPerUnit() {
        return profitPerUnit;
    }

    public void setProfitPerUnit(BigDecimal profitPerUnit) {
        this.profitPerUnit = profitPerUnit;
    }

    public BigDecimal getDepositFee() {
        return depositFee;
    }

    public void setDepositFee(BigDecimal depositFee) {
        this.depositFee = depositFee;
    }

    public BigDecimal getOpenChargeFee() {
        return openChargeFee;
    }

    public void setOpenChargeFee(BigDecimal openChargeFee) {
        this.openChargeFee = openChargeFee;
    }

    public BigDecimal getCloseChargeFee() {
        return closeChargeFee;
    }

    public void setCloseChargeFee(BigDecimal closeChargeFee) {
        this.closeChargeFee = closeChargeFee;
    }

    public BigDecimal getDeferredFee() {
        return deferredFee;
    }

    public void setDeferredFee(BigDecimal deferredFee) {
        this.deferredFee = deferredFee;
    }

    public int getMaxLot() {
        return maxLot;
    }

    public void setMaxLot(int maxLot) {
        this.maxLot = maxLot;
    }

    public int getMinLot() {
        return minLot;
    }

    public void setMinLot(int minLot) {
        this.minLot = minLot;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }
}
