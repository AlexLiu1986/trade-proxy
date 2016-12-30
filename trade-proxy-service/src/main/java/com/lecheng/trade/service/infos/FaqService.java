package com.lecheng.trade.service.infos;

import com.lecheng.trade.facade.dto.infos.faq.GetListResponse;

/**
 * 功能: 常见问题服务
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:14
 * 版本: V1.0
 */
public interface FaqService {

    /**
     * 获取常见问题列表
     *
     * @return
     */
    GetListResponse getList();
}
