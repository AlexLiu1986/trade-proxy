package com.lecheng.trade.service.trades.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.trades.hisposition.GetListRequest;
import com.lecheng.trade.facade.dto.trades.hisposition.GetListResponse;
import com.lecheng.trade.facade.dto.trades.hisposition.GetRequest;
import com.lecheng.trade.facade.dto.trades.hisposition.GetResponse;
import com.lecheng.trade.facade.model.Position;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.trades.HisPositionService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能: 历史持仓相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 12:25
 * 版本: V1.0
 */
@Service
public class HisPositionServiceImpl extends BaseServiceImpl implements HisPositionService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(HisPositionServiceImpl.class);

    /**
     * 查询历史持仓列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/hisposition/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                List<Position> positionList = JsonUtils.toBeanList(
                        result.getJSONArray("PositionList"), Position.class);
                response.setPositionList(positionList);
            }
        } catch (Exception e) {
            logger.error("查询历史持仓列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 查询历史持仓详情
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/hisposition/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setPosition((Position) JsonUtils.toBean(
                        JsonUtils.getJSONObject(result, "Position"), Position.class));
            }
        } catch (Exception e) {
            logger.error("查询历史持仓详情失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
