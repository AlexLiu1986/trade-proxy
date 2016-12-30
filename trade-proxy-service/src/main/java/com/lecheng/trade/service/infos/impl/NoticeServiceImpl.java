package com.lecheng.trade.service.infos.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.infos.notice.GetListResponse;
import com.lecheng.trade.facade.model.Notice;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.infos.NoticeService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 功能: 公告服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:06
 * 版本: V1.0
 */
@Service
public class NoticeServiceImpl extends BaseServiceImpl implements NoticeService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(NoticeServiceImpl.class);

    /**
     * 获取公告列表
     *
     * @return
     */
    @Override
    @HttpRequest(name = "infos/notice/getlist")
    public GetListResponse getList() {
        GetListResponse response = null;
        try {
            HashMap<String, String> paramMap = new HashMap<>();
            JSONObject result = httpClient.doJsonGet(this.httpRequestUrl, paramMap);
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            JSONArray arrays = JsonUtils.getJSONArray(result, "NoticeList");
            if (arrays != null) {
                List<Notice> noticeList = JsonUtils.toBeanList(arrays, Notice.class);
                response.setNoticeList(noticeList);
            }
        } catch (Exception e) {
            logger.error("查询公告列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
