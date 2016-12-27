package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.customers.account.GetRequest;
import com.lecheng.trade.facade.dto.customers.account.GetResponse;
import com.lecheng.trade.facade.dto.customers.account.LoginRequest;
import com.lecheng.trade.facade.dto.customers.account.LoginResponse;
import com.lecheng.trade.service.customers.AccountService;
import com.lecheng.trade.service.impl.BaseServiceImpl;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 功能: 账户服务实现类
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 10:15
 * 版本: V1.0
 */
@Service
public class AccountServiceImpl extends BaseServiceImpl implements AccountService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

    /**
     * 登录
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/account/login")
    public LoginResponse login(LoginRequest req) {
        LoginResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new LoginResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setSessionId(JsonUtils.getString(result, "SessionId"));
            }
        } catch (Exception e) {
            logger.error("查询账户信息失败", e);
            response = new LoginResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 查询账户信息
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/account/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setLoginId(JsonUtils.getString(result, "LoginId"));
                String balance = JsonUtils.getString(result, "Balance");
                String coupon = JsonUtils.getString(result, "Coupon");
                String couponDeadLine = JsonUtils.getString(result, "CouponDeadLine");
                if (StringUtils.isNotBlank(balance)) response.setBalance(new BigDecimal(balance));
                if (StringUtils.isNotBlank(coupon)) response.setCoupon(new BigDecimal(coupon));
            }
        } catch (Exception e) {
            logger.error("查询账户信息失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
