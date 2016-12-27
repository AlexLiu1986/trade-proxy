package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.customers.flow.GetListRequest;
import com.lecheng.trade.facade.dto.customers.flow.GetListResponse;
import com.lecheng.trade.facade.dto.customers.flow.GetRequest;
import com.lecheng.trade.facade.dto.customers.flow.GetResponse;
import com.lecheng.trade.facade.model.AccountFlow;
import com.lecheng.trade.facade.model.AccountFlowDetail;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.customers.FlowService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能: 账户流水相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 16:00
 * 版本: V1.0
 */
@Service
public class FlowServiceImpl extends BaseServiceImpl implements FlowService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(FlowServiceImpl.class);

    /**
     * 获取账户流水列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/flow/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                List<AccountFlow> accountFlowList = JsonUtils.toBeanList(
                        result.getJSONArray("AccountFlowList"), AccountFlow.class);
                response.setAccountFlowList(accountFlowList);
            }
        } catch (Exception e) {
            logger.error("查询账户流水列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 获取账户流水详情
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/flow/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setAccountFlowDetail((AccountFlowDetail)
                        JsonUtils.toBean(JsonUtils.getJSONObject(result, "AccountFlowDetail"), AccountFlowDetail.class));
            }
        } catch (Exception e) {
            logger.error("查询账户流水详情失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
