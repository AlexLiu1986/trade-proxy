package com.lecheng.trade.web.controller.prices;

import com.lecheng.trade.facade.dto.prices.timeline.GetRequest;
import com.lecheng.trade.facade.dto.prices.timeline.GetResponse;
import com.lecheng.trade.service.prices.TimeLineService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 13:34
 * 版本: V1.0
 */
@RestController
@RequestMapping("/prices/timeline")
public class TimeLineController extends BaseController {

    /**
     * 分时线服务
     */
    @Autowired
    private TimeLineService timeLineService;

    /**
     * 查询分时线
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public GetResponse get(@Valid GetRequest req) {
        return timeLineService.get(req);
    }
}
