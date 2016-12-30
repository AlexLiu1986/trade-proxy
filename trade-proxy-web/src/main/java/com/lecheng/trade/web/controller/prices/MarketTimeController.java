package com.lecheng.trade.web.controller.prices;

import com.lecheng.trade.facade.dto.prices.markettime.GetRequest;
import com.lecheng.trade.facade.dto.prices.markettime.GetResponse;
import com.lecheng.trade.service.prices.MarketTimeService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 14:09
 * 版本: V1.0
 */
@RestController
@RequestMapping("/prices/markettime")
public class MarketTimeController extends BaseController {

    /**
     * 交易时间服务
     */
    @Autowired
    private MarketTimeService marketTimeService;

    /**
     * 查询交易时间
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public GetResponse get(@Valid GetRequest req) {
        return marketTimeService.get(req);
    }
}
