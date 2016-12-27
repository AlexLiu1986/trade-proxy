package com.lecheng.trade.web.controller.deposits;

import com.lecheng.trade.facade.dto.deposits.record.GetListRequest;
import com.lecheng.trade.facade.dto.deposits.record.GetListResponse;
import com.lecheng.trade.facade.dto.deposits.record.GetRequest;
import com.lecheng.trade.facade.dto.deposits.record.GetResponse;
import com.lecheng.trade.service.deposits.RecordService;
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
 * 日期: 2016/12/27 0027 18:43
 * 版本: V1.0
 */
@RestController
@RequestMapping("/deposits/record")
public class RecordController extends BaseController {

    /**
     * 充值记录服务
     */
    @Autowired
    private RecordService recordService;

    /**
     * 查询充值列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.POST)
    public GetListResponse getList(@Valid @RequestBody GetListRequest req) {
        return recordService.getList(req);
    }

    /**
     * 查询充值详情
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public GetResponse getList(@Valid @RequestBody GetRequest req) {
        return recordService.get(req);
    }
}
