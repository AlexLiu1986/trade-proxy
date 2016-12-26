package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.regist.AddRequest;
import com.lecheng.trade.facade.dto.customers.regist.AddResponse;
import com.lecheng.trade.facade.dto.customers.regist.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.regist.GetVoiceVCodeRequest;
import com.lecheng.trade.service.customers.RegistService;
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
 * 日期: 2016/12/23 0023 10:27
 * 版本: V1.0
 */
@RestController
@RequestMapping("/customers/regist")
public class RegistController extends BaseController {

    /**
     * 注册服务
     */
    @Autowired
    private RegistService registService;

    /**
     * 获取注册短信验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvcode", method = RequestMethod.POST)
    public BaseResponse getVCode(@Valid @RequestBody GetVCodeRequest req) {
        return registService.getVCode(req);
    }

    /**
     * 获取注册语音验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvoicevcode", method = RequestMethod.POST)
    public BaseResponse getVoiceVCode(@Valid @RequestBody GetVoiceVCodeRequest req) {
        return registService.getVoiceVCode(req);
    }

    /**
     * 注册
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@Valid @RequestBody AddRequest req) {
        return registService.add(req);
    }
}
