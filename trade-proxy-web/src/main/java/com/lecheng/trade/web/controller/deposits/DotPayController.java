package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.facade.dto.deposits.dotpay.ScanRequest;
import com.lecheng.trade.facade.dto.deposits.dotpay.ScanResponse;
import com.lecheng.trade.service.deposits.DotPayService;
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
 * 日期: 2016/12/28 0028 16:19
 * 版本: V1.0
 */
@RestController
@RequestMapping("/deposits/dotpay")
public class DotPayController extends BaseController {

    /**
     * 点芯充值服务
     */
    @Autowired
    private DotPayService dotPayService;

    /**
     * 扫码充值
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/scan", method = RequestMethod.POST)
    public ScanResponse scan(@Valid @RequestBody ScanRequest req) {
        return dotPayService.scan(req);
    }
}
