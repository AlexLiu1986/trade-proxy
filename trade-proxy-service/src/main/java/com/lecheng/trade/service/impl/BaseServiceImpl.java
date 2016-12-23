package com.lecheng.trade.service.impl;

import com.lecheng.trade.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能: 服务实现类基类
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 18:16
 * 版本: V1.0
 */
@Service
public class BaseServiceImpl {

    /**
     * http通讯客户端
     */
    @Autowired
    protected HttpClientUtils httpClient;

    public HttpClientUtils getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClientUtils httpClient) {
        this.httpClient = httpClient;
    }
}
