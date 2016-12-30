package com.lecheng.trade.web.controller.infos;

import com.lecheng.trade.facade.dto.infos.rank.GetListRequest;
import com.lecheng.trade.facade.dto.infos.rank.GetListResponse;
import com.lecheng.trade.service.infos.RankService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:09
 * 版本: V1.0
 */
@RestController
@RequestMapping("/infos/rank")
public class RankController extends BaseController {

    /**
     * 排行榜服务
     */
    @Autowired
    private RankService rankService;

    /**
     * 获取排行榜列表
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public GetListResponse getList(@Valid GetListRequest req) {
        return rankService.getList(req);
    }
}
