package com.lecheng.trade.web.controller.infos;

import com.lecheng.trade.facade.dto.infos.faq.GetListResponse;
import com.lecheng.trade.service.infos.FaqService;
import com.lecheng.trade.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能: 提供Restful风格接口
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:14
 * 版本: V1.0
 */
@RestController
@RequestMapping("/infos/faq")
public class FaqController extends BaseController {

    /**
     * 常见问题服务
     */
    @Autowired
    private FaqService faqService;

    /**
     * 获取常见问题列表
     *
     * @return
     */
    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public GetListResponse getList() {
        return faqService.getList();
    }
}
