package com.lecheng.trade.service.prices.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.prices.realtime.GetListRequest;
import com.lecheng.trade.facade.dto.prices.realtime.GetListResponse;
import com.lecheng.trade.facade.model.Price;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.prices.RealTimeService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 功能: 报价服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 10:25
 * 版本: V1.0
 */
@Service
public class RealTimeServiceImpl extends BaseServiceImpl implements RealTimeService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(RealTimeServiceImpl.class);

    /**
     * 查询报价
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "prices/realtime/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            if (StringUtils.isNotBlank(req.getGoodsType())) paramMap.put("goodsType", req.getGoodsType());
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            JSONArray arrays = JsonUtils.getJSONArray(result, "PriceList");
            if (arrays != null) {
                List<Price> priceList = JsonUtils.toBeanList(arrays, Price.class);
                response.setPriceList(priceList);
            }
        } catch (Exception e) {
            logger.error("查询报价失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
