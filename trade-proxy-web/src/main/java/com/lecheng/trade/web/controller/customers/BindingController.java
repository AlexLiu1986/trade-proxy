package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.binding.AddRequest;
import com.lecheng.trade.facade.dto.customers.binding.AddResponse;
import com.lecheng.trade.facade.dto.customers.binding.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.binding.GetVoiceVCodeRequest;
import com.lecheng.trade.service.customers.BindingService;
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
 * 日期: 2016/12/27 0027 17:41
 * 版本: V1.0
 */
@RestController
@RequestMapping("/customers/binding")
public class BindingController extends BaseController {

    /**
     * 绑卡服务
     */
    @Autowired
    private BindingService bindingService;

    /**
     * 获取绑卡短信验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvcode", method = RequestMethod.POST)
    public BaseResponse getVCode(@Valid @RequestBody GetVCodeRequest req) {
        return bindingService.getVCode(req);
    }

    /**
     * 获取绑卡语音验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvoicevcode", method = RequestMethod.POST)
    public BaseResponse getVoiceVCode(@Valid @RequestBody GetVoiceVCodeRequest req) {
        return bindingService.getVoiceVCode(req);
    }

    /**
     * 绑卡
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@Valid @RequestBody AddRequest req) {
        return bindingService.add(req);
    }
}
