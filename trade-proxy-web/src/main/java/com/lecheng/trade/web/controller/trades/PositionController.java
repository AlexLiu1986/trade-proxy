package com.lecheng.trade.web.controller.trades;

import com.lecheng.trade.facade.dto.trades.position.*;
import com.lecheng.trade.service.trades.PositionService;
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
 * 日期: 2016/12/28 0028 11:10
 * 版本: V1.0
 */
@RestController
@RequestMapping("/trades/position")
public class PositionController extends BaseController {

    /**
     * 持仓服务
     */
    @Autowired
    private PositionService positionService;

    /**
     * 查询持仓列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public GetListResponse getList(@Valid @RequestBody GetListRequest req) {
        return positionService.getList(req);
    }

    /**
     * 查询持仓详情
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public GetResponse getList(@Valid @RequestBody GetRequest req) {
        return positionService.get(req);
    }

    /**
     * 建仓
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/open", method = RequestMethod.POST)
    public OpenResponse open(@Valid @RequestBody OpenRequest req) {
        return positionService.open(req);
    }

    /**
     * 平仓
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/close", method = RequestMethod.POST)
    public CloseResponse close(@Valid @RequestBody CloseRequest req) {
        return positionService.close(req);
    }

    /**
     * 修改持仓
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public ModifyResponse modify(@Valid @RequestBody ModifyRequest req) {
        return positionService.modify(req);
    }

    /**
     * 获取仓位修改记录
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/updatelog", method = RequestMethod.POST)
    public UpdateLogResponse updateLog(@Valid @RequestBody UpdateLogRequest req) {
        return positionService.updateLog(req);
    }
}
