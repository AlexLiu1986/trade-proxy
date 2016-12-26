package com.lecheng.trade.facade.dto.customers.regist;

import com.lecheng.trade.facade.dto.BaseRequest;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能: 注册请求
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 15:56
 * 版本: V1.0
 */
public class AddRequest extends BaseRequest {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = -1951006083765900230L;

    /**
     * 手机号码
     */
    @NotBlank(message = "手机号码不能为空")
    @Length(min = 11, max = 11, message = "手机号码长度必须为11位")
    private String mobile;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String hashedPassword;

    /**
     * 验证码
     */
    @NotBlank(message = "验证码不能为空")
    @Length(min = 6, max = 6, message = "验证码长度必须为6位")
    private String vcode;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 居里ID
     */
    private String mediacyId;

    /**
     * 经纪人ID
     */
    private String agentId;

    /**
     * 经纪人手机号
     */
    private String agentMobile;

    /**
     * 推荐用户账号
     */
    private String recommendCustomer;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMediacyId() {
        return mediacyId;
    }

    public void setMediacyId(String mediacyId) {
        this.mediacyId = mediacyId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentMobile() {
        return agentMobile;
    }

    public void setAgentMobile(String agentMobile) {
        this.agentMobile = agentMobile;
    }

    public String getRecommendCustomer() {
        return recommendCustomer;
    }

    public void setRecommendCustomer(String recommendCustomer) {
        this.recommendCustomer = recommendCustomer;
    }
}
