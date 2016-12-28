package com.lecheng.trade.service.deposits.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.deposits.dotpay.ScanRequest;
import com.lecheng.trade.facade.dto.deposits.dotpay.ScanResponse;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.deposits.DotPayService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 功能: 点芯充值服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 16:29
 * 版本: V1.0
 */
@Service
public class DotPayServiceImpl extends BaseServiceImpl implements DotPayService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(DotPayServiceImpl.class);

    /**
     * 扫码充值
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "deposits/dotpay/scan")
    public ScanResponse scan(ScanRequest req) {
        ScanResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new ScanResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setDepositID(JsonUtils.getLong(result, "DepositID"));
                response.setCode_img_url(JsonUtils.getString(result, "code_img_url"));
            }
        } catch (Exception e) {
            logger.error("点芯扫码充值失败", e);
            response = new ScanResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
