package com.lecheng.trade.facade.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能: 账户流水详情
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 15:55
 * 版本: V1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountFlowDetail extends AccountFlow implements Serializable {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -1366074050551075280L;

    /**
     * 用户ID
     */
    @JsonProperty(value = "CustomerId")
    private int customerId;

    /****************************以下项目入金流水时返回(FlowType=1)****************************/

    /**
     * 入金方式
     */
    @JsonProperty(value = "DepositType")
    private String depositType;

    /**
     * 入金方式名称
     */
    @JsonProperty(value = "DepositTypeName")
    private String depositTypeName;

    /**************************************
     * 以下项目入金流水时返回(FlowType=2)
     * ************************************/

    /**
     * 银行
     */
    @JsonProperty(value = "Bank")
    private String bank;

    /**
     * 银行卡号
     */
    @JsonProperty(value = "CardNo")
    private String cardNo;

    /**
     * 姓名
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * 出金状态：1-申请中，2-成功，3-失败
     */
    @JsonProperty(value = "Status")
    private int status;

    /**
     * 出金金额
     */
    @JsonProperty(value = "WithdrawAmount")
    private BigDecimal withdrawAmount;

    /**
     * 出金手续费
     */
    @JsonProperty(value = "WithdrawCharge")
    private BigDecimal withdrawCharge;

    /*****************************************
     * 以下项目入金流水时返回(FlowType=3,4)
     *****************************************/

    /**
     * 商品名称
     */
    @JsonProperty(value = "GoodsName")
    private String goodsName;

    /**
     * 建仓方向：1-买涨，2-买跌
     */
    @JsonProperty(value = "BuySell")
    private int buySell;

    /**
     * 建仓手数
     */
    @JsonProperty(value = "PositionAmount")
    private BigDecimal positionAmount;

    /**
     * 建仓价格
     */
    @JsonProperty(value = "OpenPrice")
    private BigDecimal openPrice;

    /**
     * 建仓时间
     */
    @JsonProperty(value = "PositionTime")
    private Date positionTime;

    /**
     * 建仓成本
     */
    @JsonProperty(value = "OpenCost")
    private BigDecimal openCost;

    /**
     * 建仓手续费
     */
    @JsonProperty(value = "OpenCharge")
    private BigDecimal openCharge;

    /**
     * 平仓价格
     */
    @JsonProperty(value = "ClosePrice")
    private BigDecimal closePrice;

    /**
     * 平仓时间
     */
    @JsonProperty(value = "CloseTime")
    private Date closeTime;

    /**
     * 平仓收入
     */
    @JsonProperty(value = "CloseIncome")
    private BigDecimal closeIncome;

    /**
     * 平仓手续费
     */
    @JsonProperty(value = "CloseCharge")
    private BigDecimal closeCharge;

    /**
     * 平仓类型
     */
    @JsonProperty(value = "CloseType")
    private int closeType;

    /**
     * 平仓类型名称
     */
    @JsonProperty(value = "CloseTypeName")
    private String closeTypeName;

    /**************************************
     * 以下项目入金流水时返回(FlowType=5)
     **************************************/

    /**
     * 红包标题
     */
    @JsonProperty(value = "Title")
    private String title;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getDepositTypeName() {
        return depositTypeName;
    }

    public void setDepositTypeName(String depositTypeName) {
        this.depositTypeName = depositTypeName;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public BigDecimal getWithdrawCharge() {
        return withdrawCharge;
    }

    public void setWithdrawCharge(BigDecimal withdrawCharge) {
        this.withdrawCharge = withdrawCharge;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getBuySell() {
        return buySell;
    }

    public void setBuySell(int buySell) {
        this.buySell = buySell;
    }

    public BigDecimal getPositionAmount() {
        return positionAmount;
    }

    public void setPositionAmount(BigDecimal positionAmount) {
        this.positionAmount = positionAmount;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public Date getPositionTime() {
        return positionTime;
    }

    public void setPositionTime(Date positionTime) {
        this.positionTime = positionTime;
    }

    public BigDecimal getOpenCost() {
        return openCost;
    }

    public void setOpenCost(BigDecimal openCost) {
        this.openCost = openCost;
    }

    public BigDecimal getOpenCharge() {
        return openCharge;
    }

    public void setOpenCharge(BigDecimal openCharge) {
        this.openCharge = openCharge;
    }

    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public BigDecimal getCloseIncome() {
        return closeIncome;
    }

    public void setCloseIncome(BigDecimal closeIncome) {
        this.closeIncome = closeIncome;
    }

    public BigDecimal getCloseCharge() {
        return closeCharge;
    }

    public void setCloseCharge(BigDecimal closeCharge) {
        this.closeCharge = closeCharge;
    }

    public int getCloseType() {
        return closeType;
    }

    public void setCloseType(int closeType) {
        this.closeType = closeType;
    }

    public String getCloseTypeName() {
        return closeTypeName;
    }

    public void setCloseTypeName(String closeTypeName) {
        this.closeTypeName = closeTypeName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
