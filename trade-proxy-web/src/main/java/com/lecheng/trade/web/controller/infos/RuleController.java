package com.lecheng.trade.web.controller.infos;

import com.lecheng.trade.facade.dto.infos.rule.GetListResponse;
import com.lecheng.trade.service.infos.RuleService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:01
 * 版本: V1.0
 */
@RestController
@RequestMapping("/infos/rule")
public class RuleController extends BaseController {

    /**
     * 交易规则服务
     */
    @Autowired
    private RuleService ruleService;

    /**
     * 获取排行榜列表
     *
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public GetListResponse getList() {
        return ruleService.getList();
    }
}
