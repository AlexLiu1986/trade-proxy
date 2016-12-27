package com.lecheng.trade.facade.dto.customers.binding;

import com.lecheng.trade.facade.dto.SessionRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 绑卡请求
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:13
 * 版本: V1.0
 */
public class AddRequest extends SessionRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -1325872547456627274L;

    /**
     * 银行
     */
    @NotBlank(message = "银行名称不能为空")
    @Length(max = 32, message = "银行名称长度不能超过32位")
    private String bank;

    /**
     * 支行
     */
    @Length(max = 32, message = "支行名称长度不能超过32位")
    private String branchBank;

    /**
     * 省份
     */
    @Length(max = 32, message = "开户省份长度不能超过32位")
    private String province;

    /**
     * 城市
     */
    @Length(max = 32, message = "开户城市长度不能超过32位")
    private String city;

    /**
     * 银行卡号
     */
    @NotBlank(message = "银行卡号不能为空")
    @Length(max = 20, message = "银行卡号长度不能超过20位")
    private String cardNo;

    /**
     * 持卡人姓名
     */
    @NotBlank(message = "持卡人姓名不能为空")
    @Length(max = 20, message = "持卡人姓名长度不能超过20位")
    private String name;

    /**
     * 验证码
     */
    @NotBlank(message = "验证码不能为空")
    @Length(min = 6, max = 6, message = "验证码长度必须为6位")
    private String vcode;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranchBank() {
        return branchBank;
    }

    public void setBranchBank(String branchBank) {
        this.branchBank = branchBank;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }
}
