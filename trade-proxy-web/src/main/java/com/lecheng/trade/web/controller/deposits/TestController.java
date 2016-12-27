package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.facade.dto.deposits.test.PayRequest;
import com.lecheng.trade.facade.dto.deposits.test.PayResponse;
import com.lecheng.trade.service.deposits.TestService;
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
 * 日期: 2016/12/27 0027 18:43
 * 版本: V1.0
 */
@RestController
@RequestMapping("/deposits/test")
public class TestController extends BaseController {

    /**
     * 测试充值服务
     */
    @Autowired
    private TestService testService;

    /**
     * 测试充值
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/pay", method = RequestMethod.POST)
    public PayResponse pay(@Valid @RequestBody PayRequest req) {
        return testService.pay(req);
    }
}
