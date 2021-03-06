package com.lecheng.trade.web.controller.prices;

import com.lecheng.trade.facade.dto.prices.realtime.GetListRequest;
import com.lecheng.trade.facade.dto.prices.realtime.GetListResponse;
import com.lecheng.trade.service.prices.RealTimeService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:07
 * 版本: V1.0
 */
@RestController
@RequestMapping("/prices/realtime")
public class RealTimeController extends BaseController {

    /**
     * 报价服务
     */
    @Autowired
    private RealTimeService realTimeService;

    /**
     * 查询报价
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public GetListResponse getList(@Valid GetListRequest req) {
        return realTimeService.getList(req);
    }
}