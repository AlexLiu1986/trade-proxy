package com.lecheng.trade.facade.dto.deposits.dotpay;

import com.lecheng.trade.facade.dto.BaseResponse;

/**
 * 功能: 扫码充值响应
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 16:24
 * 版本: V1.0
 */
public class ScanResponse extends BaseResponse {

    /**
     * SerialVersionUID
     */
    private static final long serialVersionUID = 490083371288830279L;

    /**
     * 充值订单流水号
     */
    private long depositID;

    /**
     * 支付地址（二维码图片地址）
     */
    private String code_img_url;

    public ScanResponse() {
    }

    public ScanResponse(int respCode, String respMsg) {
        super(respCode, respMsg);
    }

    public long getDepositID() {
        return depositID;
    }

    public void setDepositID(long depositID) {
        this.depositID = depositID;
    }

    public String getCode_img_url() {
        return code_img_url;
    }

    public void setCode_img_url(String code_img_url) {
        this.code_img_url = code_img_url;
    }
}
