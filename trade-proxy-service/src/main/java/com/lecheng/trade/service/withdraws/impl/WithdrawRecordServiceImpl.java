package com.lecheng.trade.service.withdraws.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.withdraws.record.GetListRequest;
import com.lecheng.trade.facade.dto.withdraws.record.GetListResponse;
import com.lecheng.trade.facade.dto.withdraws.record.GetRequest;
import com.lecheng.trade.facade.dto.withdraws.record.GetResponse;
import com.lecheng.trade.facade.model.Withdraw;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.withdraws.WithdrawRecordService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能: 提现记录相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 10:56
 * 版本: V1.0
 */
@Service
public class WithdrawRecordServiceImpl extends BaseServiceImpl implements WithdrawRecordService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(WithdrawRecordServiceImpl.class);

    /**
     * 查询提现记录列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "withdraws/record/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                List<Withdraw> withdrawList = JsonUtils.toBeanList(
                        result.getJSONArray("WithdrawList"), Withdraw.class);
                response.setWithdrawList(withdrawList);
            }
        } catch (Exception e) {
            logger.error("查询提现列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 查询提现详情
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "withdraws/record/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setWithdraw((Withdraw) JsonUtils.toBean(
                        JsonUtils.getJSONObject(result, "Withdraw"), Withdraw.class));
            }
        } catch (Exception e) {
            logger.error("查询提现详情失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
