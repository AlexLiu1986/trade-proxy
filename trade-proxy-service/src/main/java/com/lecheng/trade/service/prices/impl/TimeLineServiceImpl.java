package com.lecheng.trade.service.prices.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.prices.timeline.GetRequest;
import com.lecheng.trade.facade.dto.prices.timeline.GetResponse;
import com.lecheng.trade.facade.model.PriceKChart;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.prices.TimeLineService;
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
 * 功能: 分时线服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 13:43
 * 版本: V1.0
 */
@Service
public class TimeLineServiceImpl extends BaseServiceImpl implements TimeLineService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(TimeLineServiceImpl.class);

    /**
     * 查询分时线
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "prices/timeline/get")
    public GetResponse get(GetRequest req) {
        GetResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            if (StringUtils.isNotBlank(req.getGoodsType())) paramMap.put("goodsType", req.getGoodsType());
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            JSONArray arrays = JsonUtils.getJSONArray(result, "PriceItemList");
            if (arrays != null) {
                List<PriceKChart> priceItemList = JsonUtils.toBeanList(arrays, PriceKChart.class);
                response.setPriceItemList(priceItemList);
            }
        } catch (Exception e) {
            logger.error("查询分时线数据失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
