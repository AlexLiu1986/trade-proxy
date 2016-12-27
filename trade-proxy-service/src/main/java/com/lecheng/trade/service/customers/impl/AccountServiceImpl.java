package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.customers.account.GetRequest;
import com.lecheng.trade.facade.dto.customers.account.GetResponse;
import com.lecheng.trade.facade.dto.customers.account.LoginRequest;
import com.lecheng.trade.facade.dto.customers.account.LoginResponse;
import com.lecheng.trade.facade.model.Customer;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.customers.AccountService;
import com.lecheng.trade.utils.AesUtils;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
            req.setHashedPassword(AesUtils.encrypt(req.getHashedPassword(), AesUtils.AesKey));
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new LoginResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setSessionId(JsonUtils.getString(result, "SessionId"));
                response.setCustomer((Customer) JsonUtils.toBean(JsonUtils.getJSONObject(result, "Customer"), Customer.class));
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
                response.setBalance(JsonUtils.getBigDecimal(result, "Balance"));
                response.setCoupon(JsonUtils.getBigDecimal(result, "Coupon"));
                response.setCouponDeadline(JsonUtils.getDate(result, "CouponDeadline"));
            }
        } catch (Exception e) {
            logger.error("查询账户信息失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
