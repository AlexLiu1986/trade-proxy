package com.lecheng.trade.web.controller.infos;

import com.lecheng.trade.facade.dto.infos.goods.GetListRequest;
import com.lecheng.trade.facade.dto.infos.goods.GetListResponse;
import com.lecheng.trade.service.infos.GoodsService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 13:29
 * 版本: V1.0
 */
@RestController
@RequestMapping("/infos/goods")
public class GoodsController extends BaseController {

    /**
     * 商品服务
     */
    @Autowired
    private GoodsService goodsService;

    /**
     * 获取商品列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public GetListResponse getList(@Valid GetListRequest req) {
        return goodsService.getList(req);
    }
}
