package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.facade.dto.deposits.easypay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.easypay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.easypay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.easypay.VerifyResponse;
import com.lecheng.trade.service.deposits.EasyPayService;
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
 * 日期: 2017/1/3 0003 10:48
 * 版本: V1.0
 */
@RestController
@RequestMapping("/deposits/easypay")
public class EasyPayController extends BaseController {

    /**
     * 易生支付服务
     */
    @Autowired
    private EasyPayService easyPayService;

    /**
     * 充值
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public PayResponse pay(@Valid @RequestBody PayRequest req) {
        return easyPayService.pay(req);
    }

    /**
     * 充值订单查询
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public VerifyResponse verify(@Valid @RequestBody VerifyRequest req) {
        return easyPayService.verify(req);
    }
}
