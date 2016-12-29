package com.lecheng.trade.service.prices.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.prices.markettime.GetRequest;
import com.lecheng.trade.facade.dto.prices.markettime.GetResponse;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.prices.MarketTimeService;
import com.lecheng.trade.utils.DateUtils;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * 功能: 交易时间服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 14:19
 * 版本: V1.0
 */
@Service
public class MarketTimeServiceImpl extends BaseServiceImpl implements MarketTimeService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(MarketTimeServiceImpl.class);

    /**
     * 查询K线
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "prices/markettime/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            if (StringUtils.isNotBlank(req.getGoodsType())) paramMap.put("goodsType", req.getGoodsType());
            if (req.getMarketDate() != null) paramMap.put("marketDate",
                    DateUtils.format(req.getMarketDate(), DateUtils.DEFAULT_DATA_FORMAT));
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setGoodsType(JsonUtils.getString(result, "GoodsType"));
            response.setMarketDate(JsonUtils.getDate(result, "MarketDate", DateUtils.DEFAULT_DATETIME_FORMAT));
            response.setMarketStatus(JsonUtils.getInt(result, "MarketStatus"));
            response.setOpenTime1(JsonUtils.getDate(result, "OpenTime1", DateUtils.DEFAULT_DATETIME_FORMAT));
            response.setCloseTime1(JsonUtils.getDate(result, "CloseTime1", DateUtils.DEFAULT_DATETIME_FORMAT));
            response.setOpenTime2(JsonUtils.getDate(result, "OpenTime2", DateUtils.DEFAULT_DATETIME_FORMAT));
            response.setCloseTime2(JsonUtils.getDate(result, "CloseTime2", DateUtils.DEFAULT_DATETIME_FORMAT));
            response.setOpenTime3(JsonUtils.getDate(result, "OpenTime3", DateUtils.DEFAULT_DATETIME_FORMAT));
            response.setCloseTime3(JsonUtils.getDate(result, "CloseTime3", DateUtils.DEFAULT_DATETIME_FORMAT));
        } catch (Exception e) {
            logger.error("查询交易时间失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
