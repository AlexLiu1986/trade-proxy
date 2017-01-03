package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.service.deposits.JdPayService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
