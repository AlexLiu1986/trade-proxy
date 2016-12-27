package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.customers.bankcard.GetListRequest;
import com.lecheng.trade.facade.dto.customers.bankcard.GetListResponse;
import com.lecheng.trade.service.customers.BankCardService;
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
@RequestMapping("/customers/bankcard")
public class BankCardController extends BaseController {

    /**
     * 银行卡服务
     */
    @Autowired
    private BankCardService bankCardService;

    /**
     * 获取绑定银行卡列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public GetListResponse getList(@Valid @RequestBody GetListRequest req) {
        return bankCardService.getList(req);
    }
}
