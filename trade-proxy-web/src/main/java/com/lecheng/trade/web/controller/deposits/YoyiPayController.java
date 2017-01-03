package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.facade.dto.deposits.yoyipay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.yoyipay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.yoyipay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.yoyipay.VerifyResponse;
import com.lecheng.trade.service.deposits.YoyiPayService;
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
 * 日期: 2017/1/3 0003 12:19
 * 版本: V1.0
 */
@RestController
@RequestMapping("/deposits/yoyipay")
public class YoyiPayController extends BaseController {

    /**
     * 甬易充值服务
     */
    @Autowired
    private YoyiPayService yoyiPayService;

    /**
     * 充值
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public PayResponse pay(@Valid @RequestBody PayRequest req) {
        return yoyiPayService.pay(req);
    }

    /**
     * 甬易充值(匿名通道)
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/anonymouspay", method = RequestMethod.POST)
    public PayResponse anonymouspay(@Valid @RequestBody PayRequest req) {
        return yoyiPayService.pay(req);
    }

    /**
     * 充值订单查询
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public VerifyResponse verify(@Valid @RequestBody VerifyRequest req) {
        return yoyiPayService.verify(req);
    }
}
