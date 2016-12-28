package com.lecheng.trade.service.trades.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.trades.position.*;
import com.lecheng.trade.facade.model.Position;
import com.lecheng.trade.facade.model.PositionUpdate;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.trades.PositionService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能: 持仓相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/28 0028 11:20
 * 版本: V1.0
 */
@Service
public class PositionServiceImpl extends BaseServiceImpl implements PositionService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(PositionServiceImpl.class);

    /**
     * 查询持仓列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/position/getlist")
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
            logger.error("查询持仓列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 查询持仓详情
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/position/get")
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
            logger.error("查询持仓详情失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 建仓
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/position/open")
    public OpenResponse open(OpenRequest req) {
        OpenResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new OpenResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setPosition((Position) JsonUtils.toBean(
                        JsonUtils.getJSONObject(result, "Position"), Position.class));
            }
        } catch (Exception e) {
            logger.error("建仓失败", e);
            response = new OpenResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 平仓
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/position/close")
    public CloseResponse close(CloseRequest req) {
        CloseResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new CloseResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setPosition((Position) JsonUtils.toBean(
                        JsonUtils.getJSONObject(result, "Position"), Position.class));
            }
        } catch (Exception e) {
            logger.error("平仓失败", e);
            response = new CloseResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 修改持仓
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/position/modify")
    public ModifyResponse modify(ModifyRequest req) {
        ModifyResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new ModifyResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                response.setPosition((Position) JsonUtils.toBean(
                        JsonUtils.getJSONObject(result, "Position"), Position.class));
            }
        } catch (Exception e) {
            logger.error("修改持仓失败", e);
            response = new ModifyResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }

    /**
     * 获取仓位修改记录
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "trades/position/updatelog")
    public UpdateLogResponse updateLog(UpdateLogRequest req) {
        UpdateLogResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new UpdateLogResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                List<PositionUpdate> positionUpdateLog = JsonUtils.toBeanList(
                        result.getJSONArray("PositionUpdateLog"), PositionUpdate.class);
                response.setPositionUpdateLog(positionUpdateLog);
            }
        } catch (Exception e) {
            logger.error("查询仓位修改记录失败", e);
            response = new UpdateLogResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
