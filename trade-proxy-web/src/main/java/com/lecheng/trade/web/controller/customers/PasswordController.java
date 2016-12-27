package com.lecheng.trade.web.controller.customers;

import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.dto.customers.password.GetVCodeRequest;
import com.lecheng.trade.facade.dto.customers.password.GetVoiceVCodeRequest;
import com.lecheng.trade.facade.dto.customers.password.ResetRequest;
import com.lecheng.trade.facade.dto.customers.password.ResetResponse;
import com.lecheng.trade.service.customers.PasswordService;
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
 * 日期: 2016/12/27 0027 09:14
 * 版本: V1.0
 */
@RestController
@RequestMapping("/customers/password")
public class PasswordController extends BaseController {

    /**
     * 密码服务
     */
    @Autowired
    private PasswordService passwordService;

    /**
     * 获取重置密码短信验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvcode", method = RequestMethod.POST)
    public BaseResponse getVCode(@Valid @RequestBody GetVCodeRequest req) {
        return passwordService.getVCode(req);
    }

    /**
     * 获取重置密码语音验证码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/getvoicevcode", method = RequestMethod.POST)
    public BaseResponse getVoiceVCode(@Valid @RequestBody GetVoiceVCodeRequest req) {
        return passwordService.getVoiceVCode(req);
    }

    /**
     * 重置密码
     *
     * @param req
     * @return
     */
    @RequestMapping(value = "/reset", method = RequestMethod.POST)
    public ResetResponse reset(@Valid @RequestBody ResetRequest req) {
        return passwordService.reset(req);
    }
}
