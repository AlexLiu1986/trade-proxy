package com.lecheng.trade.service.infos;

import com.lecheng.trade.facade.dto.infos.notice.GetListResponse;

/**
 * 功能: 公告服务
 * 创建: liuchongguang
 * 日期: 2016/12/30 0030 15:05
 * 版本: V1.0
 */
public interface NoticeService {

    /**
     * 获取公告列表
     *
     * @return
     */
    GetListResponse getList();
}
