package com.lecheng.trade.web.controller.withdraws;

import com.lecheng.trade.facade.dto.withdraws.cash.CashRequest;
import com.lecheng.trade.facade.dto.withdraws.cash.CashResponse;
import com.lecheng.trade.service.withdraws.CashBankCardService;
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
 * 日期: 2016/12/27 0027 17:40
 * 版本: V1.0
 */
@RestController
@RequestMapping("/withdraws/bankcard")
public class CashBankCardController extends BaseController {

    /**
     * 银行卡服务
     */
    @Autowired
    private CashBankCardService cashBankCardService;

    /**
     * 银行卡提现
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/cash", method = RequestMethod.POST)
    public CashResponse cash(@Valid @RequestBody CashRequest req) {
        return cashBankCardService.cash(req);
    }
}
