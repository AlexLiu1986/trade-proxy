package com.lecheng.trade.service.prices.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.prices.kchart.GetResponse;
import com.lecheng.trade.facade.model.PriceKChart;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.prices.KChartService;
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
 * 功能: K线服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/29 0029 11:55
 * 版本: V1.0
 */
@Service
public class KChartServiceImpl extends BaseServiceImpl implements KChartService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(KChartServiceImpl.class);

    /**
     * 查询K线
     *
     * @param goodsType
     * @param chartType
     * @return
     */
    @Override
    @HttpRequest(name = "prices/kchart/get")
    public GetResponse get(String goodsType, String chartType) {
        GetResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            if (StringUtils.isNotBlank(goodsType)) paramMap.put("goodsType", goodsType);
            if (StringUtils.isNotBlank(chartType)) paramMap.put("chartType", chartType);
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            JSONArray arrays = JsonUtils.getJSONArray(result, "PriceItemList");
            if (arrays != null) {
                List<PriceKChart> priceItemList = JsonUtils.toBeanList(arrays, PriceKChart.class);
                response.setPriceItemList(priceItemList);
            }
        } catch (Exception e) {
            logger.error("查询K线数据失败", e);
            response = new GetResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
