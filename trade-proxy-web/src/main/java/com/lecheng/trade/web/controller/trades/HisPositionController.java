package com.lecheng.trade.web.controller.trades;

import com.lecheng.trade.facade.dto.trades.hisposition.GetListRequest;
import com.lecheng.trade.facade.dto.trades.hisposition.GetListResponse;
import com.lecheng.trade.facade.dto.trades.hisposition.GetRequest;
import com.lecheng.trade.facade.dto.trades.hisposition.GetResponse;
import com.lecheng.trade.service.trades.HisPositionService;
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
 * 日期: 2016/12/28 0028 12:19
 * 版本: V1.0
 */
@RestController
@RequestMapping("/trades/hisposition")
public class HisPositionController extends BaseController {

    /**
     * 历史持仓服务
     */
    @Autowired
    private HisPositionService hisPositionService;

    /**
     * 查询历史持仓列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public GetListResponse getList(@Valid @RequestBody GetListRequest req) {
        return hisPositionService.getList(req);
    }

    /**
     * 查询历史持仓详情
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public GetResponse getList(@Valid @RequestBody GetRequest req) {
        return hisPositionService.get(req);
    }
}
