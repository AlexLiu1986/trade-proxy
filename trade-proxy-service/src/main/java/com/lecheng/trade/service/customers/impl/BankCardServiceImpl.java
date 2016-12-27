package com.lecheng.trade.service.customers.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.facade.constants.RespCode;
import com.lecheng.trade.facade.dto.customers.bankcard.GetListRequest;
import com.lecheng.trade.facade.dto.customers.bankcard.GetListResponse;
import com.lecheng.trade.facade.model.Card;
import com.lecheng.trade.service.BaseServiceImpl;
import com.lecheng.trade.service.customers.BankCardService;
import com.lecheng.trade.utils.JsonUtils;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能: 银行卡相关服务实现
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 17:55
 * 版本: V1.0
 */
@Service
public class BankCardServiceImpl extends BaseServiceImpl implements BankCardService {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(BankCardServiceImpl.class);

    /**
     * 获取绑定银行卡列表
     *
     * @param req
     * @return
     */
    @Override
    @HttpRequest(name = "customers/bankcard/getlist")
    public GetListResponse getList(GetListRequest req) {
        GetListResponse response = null;
        try {
            JSONObject result = httpClient.doJsonPost(this.httpRequestUrl, JSONObject.fromObject(req).toString());
            response = new GetListResponse(RespCode.SUCC.getValue(), RespCode.SUCC.getDesc());
            response.setRemoteResultCD(result);
            if (response.isResultOK()) {
                List<Card> cardList = JsonUtils.toBeanList(
                        result.getJSONArray("CardList"), Card.class);
                response.setCardList(cardList);
            }
        } catch (Exception e) {
            logger.error("查询绑定银行卡列表失败", e);
            response = new GetListResponse(RespCode.FAIL.getValue(), RespCode.FAIL.getDesc());
        }
        return response;
    }
}
