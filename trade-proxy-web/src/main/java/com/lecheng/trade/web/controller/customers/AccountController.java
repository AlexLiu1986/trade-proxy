package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.ReqObj;
import com.lecheng.trade.facade.dto.RespObj;
import com.lecheng.trade.facade.dto.customers.account.GetAccountInfoRequest;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/22 0022 15:42
 * 版本: V1.0
 */
@RestController
@RequestMapping("/customers/account")
public class AccountController extends BaseController {

    @RequestMapping(value = "/getAccountInfo", method = RequestMethod.POST)
    public RespObj<BaseResponse> getAccountInfo(@Valid @RequestBody ReqObj<GetAccountInfoRequest> req) {
        return null;
    }
}
