package com.lecheng.trade.service.deposits.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.deposits.record.GetListRequest;
import com.lecheng.trade.facade.dto.deposits.record.GetListResponse;
import com.lecheng.trade.facade.dto.deposits.record.GetRequest;
import com.lecheng.trade.facade.dto.deposits.record.GetResponse;
import com.lecheng.trade.facade.model.Deposit;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.deposits.RecordService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能: 充值记录服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 18:56
 * 版本: V1.0
 */
@Service
public class RecordServiceImpl extends BaseServiceImpl implements RecordService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(RecordServiceImpl.class);

    /**
     * 查询充值列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "deposits/record/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                List<Deposit> depositList = JsonUtils.toBeanList(
                        result.getJSONArray("DepositList"), Deposit.class);
                response.setDepositList(depositList);
            }
        } catch (Exception e) {
            logger.error("查询充值列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 查询充值详情
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "deposits/record/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setDeposit((Deposit) JsonUtils.toBean(
                        JsonUtils.getJSONObject(result, "Deposit"), Deposit.class));
            }
        } catch (Exception e) {
            logger.error("查询充值详情失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
