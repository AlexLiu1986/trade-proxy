package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.customers.account.GetRequest;
import com.lecheng.trade.facade.dto.customers.account.GetResponse;
import com.lecheng.trade.service.customers.AccountService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 账户服务
     */
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public GetResponse get(@Valid @RequestBody GetRequest req) {
        return accountService.get(req);
    }
}
