package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.customers.flow.GetListRequest;
import com.lecheng.trade.facade.dto.customers.flow.GetListResponse;
import com.lecheng.trade.facade.dto.customers.flow.GetRequest;
import com.lecheng.trade.facade.dto.customers.flow.GetResponse;
import com.lecheng.trade.service.customers.FlowService;
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
 * 日期: 2016/12/27 0027 15:35
 * 版本: V1.0
 */
@RestController
@RequestMapping("/customers/flow")
public class FlowController extends BaseController {

    /**
     * 流水服务
     */
    @Autowired
    private FlowService flowService;

    /**
     * 获取账户流水列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public GetListResponse getList(@Valid @RequestBody GetListRequest req) {
        return flowService.getList(req);
    }

    /**
     * 获取账户流水详情
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public GetResponse get(@Valid @RequestBody GetRequest req) {
        return flowService.get(req);
    }
}
