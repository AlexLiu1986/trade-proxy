package com.lecheng.trade.service.infos.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.infos.rank.GetListRequest;
import com.lecheng.trade.facade.dto.infos.rank.GetListResponse;
import com.lecheng.trade.facade.model.Rank;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.infos.RankService;
import com.lecheng.trade.utils.DateUtils;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 功能: 排行榜服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 14:40
 * 版本: V1.0
 */
@Service
public class RankServiceImpl extends BaseServiceImpl implements RankService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(RankServiceImpl.class);

    /**
     * 获取排行榜列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "infos/rank/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            paramMap.put("rankType", String.valueOf(req.getRankType()));
            paramMap.put("rankDay", DateUtils.format(req.getRankDay(), "dd/MM/yyyy"));
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            JSONArray arrays = JsonUtils.getJSONArray(result, "RankList");
            if (arrays != null) {
                List<Rank> rankList = JsonUtils.toBeanList(arrays, Rank.class);
                response.setRankList(rankList);
            }
        } catch (Exception e) {
            logger.error("查询排行榜列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
