package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.unbinding.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.RemoveRequest;
import com.lecheng.trade.facade.dto.customers.unbinding.RemoveResponse;
import com.lecheng.trade.service.customers.UnbindingService;
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
 * 日期: 2016/12/27 0027 17:42
 * 版本: V1.0
 */
@RestController
@RequestMapping("/customers/unbinding")
public class UnbindingController extends BaseController {

    /**
     * 解绑卡服务
     */
    @Autowired
    private UnbindingService unbindingService;

    /**
     * 获取解绑卡短信验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvcode", method = RequestMethod.POST)
    public BaseResponse getVCode(@Valid @RequestBody GetVCodeRequest req) {
        return unbindingService.getVCode(req);
    }

    /**
     * 获取解绑卡语音验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvoicevcode", method = RequestMethod.POST)
    public BaseResponse getVoiceVCode(@Valid @RequestBody GetVoiceVCodeRequest req) {
        return unbindingService.getVoiceVCode(req);
    }

    /**
     * 解绑卡
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public RemoveResponse remove(@Valid @RequestBody RemoveRequest req) {
        return unbindingService.remove(req);
    }
}
