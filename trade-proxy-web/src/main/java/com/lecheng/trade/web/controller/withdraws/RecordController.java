package com.lecheng.trade.web.controller.withdraws;

import com.lecheng.trade.facade.dto.withdraws.record.GetListRequest;
import com.lecheng.trade.facade.dto.withdraws.record.GetListResponse;
import com.lecheng.trade.facade.dto.withdraws.record.GetRequest;
import com.lecheng.trade.facade.dto.withdraws.record.GetResponse;
import com.lecheng.trade.service.withdraws.RecordService;
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
 * 日期: 2016/12/28 0028 09:36
 * 版本: V1.0
 */
@RestController
@RequestMapping("/withdraws/record")
public class RecordController extends BaseController {

    /**
     * 提现记录服务
     */
    @Autowired
    private RecordService recordService;

    /**
     * 查询提现记录列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public GetListResponse getList(@Valid @RequestBody GetListRequest req) {
        return recordService.getList(req);
    }

    /**
     * 查询提现详情
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public GetResponse getList(@Valid @RequestBody GetRequest req) {
        return recordService.get(req);
    }
}
