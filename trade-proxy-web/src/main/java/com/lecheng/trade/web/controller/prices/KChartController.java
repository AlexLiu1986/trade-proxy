package com.lecheng.trade.web.controller.prices;

import com.lecheng.trade.facade.dto.prices.kchart.GetResponse;
import com.lecheng.trade.service.prices.KChartService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebParam;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 11:42
 * 版本: V1.0
 */
@RestController
@RequestMapping("/prices/kchart")
public class KChartController extends BaseController {

    /**
     * K线服务
     */
    @Autowired
    private KChartService kChartService;

    /**
     * 查询K线
     *
     * @param goodsType
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public GetResponse get(@WebParam String goodsType, @WebParam String chartType) {
        return kChartService.get(goodsType, chartType);
    }
}
