package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.facade.dto.deposits.jdpay.PayRequest;
import com.lecheng.trade.facade.dto.deposits.jdpay.PayResponse;
import com.lecheng.trade.facade.dto.deposits.jdpay.VerifyRequest;
import com.lecheng.trade.facade.dto.deposits.jdpay.VerifyResponse;
import com.lecheng.trade.service.deposits.JdPayService;
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
@RequestMapping("/deposits/jdpay")
public class JdPayController extends BaseController {

    /**
     * 京东支付服务
     */
    @Autowired
    private JdPayService jdPayService;

    /**
     * 充值
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public PayResponse pay(@Valid @RequestBody PayRequest req) {
        return jdPayService.pay(req);
    }

    /**
     * 充值订单查询
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public VerifyResponse verify(@Valid @RequestBody VerifyRequest req) {
        return jdPayService.verify(req);
    }
}
