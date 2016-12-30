package com.lecheng.trade.service.infos.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.infos.goods.GetListRequest;
import com.lecheng.trade.facade.dto.infos.goods.GetListResponse;
import com.lecheng.trade.facade.model.Goods;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.infos.GoodsService;
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
 * 功能: 商品服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 13:44
 * 版本: V1.0
 */
@Service
public class GoodsServiceImpl extends BaseServiceImpl implements GoodsService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);

    /**
     * 获取商品列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "infos/goods/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            if (StringUtils.isNotBlank(req.getGoodsType())) paramMap.put("goodsType", req.getGoodsType());
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            JSONArray arrays = JsonUtils.getJSONArray(result, "GoodsList");
            if (arrays != null) {
                List<Goods> goodsList = JsonUtils.toBeanList(arrays, Goods.class);
                response.setGoodsList(goodsList);
            }
        } catch (Exception e) {
            logger.error("查询商品列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
