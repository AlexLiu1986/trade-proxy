package com.lecheng.trade.web.controller;

import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.BaseResponse;
import com.lecheng.trade.facade.exception.ParameterValidException;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能:
 * 创建: liuchongguang
 * 日期: 2016/12/22 0022 17:34
 * 版本: V1.0
 */
public class BaseController {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public BaseResponse handleException(MethodArgumentNotValidException exception) {
        logger.error("请求参数校验错误:" + exception.getMessage());
        BaseResponse baseResponse = new BaseResponse(RespCode.REQUEST_PARAMS_VALID_ERROR.getValue(),
                RespCode.REQUEST_PARAMS_VALID_ERROR.getDesc());
        if (CollectionUtils.isNotEmpty(exception.getBindingResult().getFieldErrors())) {
            List<ParameterValidException> exceptions = new ArrayList<>();
            for (FieldError e : exception.getBindingResult().getFieldErrors()) {
                exceptions.add(new ParameterValidException(e.getField(), e.getDefaultMessage()));
            }
            baseResponse.setParameterValidExceptions(exceptions);
        }
        return baseResponse;
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public BaseResponse handleException(BindException exception) {
        logger.error("请求参数校验错误:" + exception.getMessage());
        BaseResponse baseResponse = new BaseResponse(RespCode.REQUEST_PARAMS_VALID_ERROR.getValue(),
                RespCode.REQUEST_PARAMS_VALID_ERROR.getDesc());
        if (CollectionUtils.isNotEmpty(exception.getBindingResult().getFieldErrors())) {
            List<ParameterValidException> exceptions = new ArrayList<>();
            for (FieldError e : exception.getBindingResult().getFieldErrors()) {
                exceptions.add(new ParameterValidException(e.getField(), e.getDefaultMessage()));
            }
            baseResponse.setParameterValidExceptions(exceptions);
        }
        return baseResponse;
    }
}
