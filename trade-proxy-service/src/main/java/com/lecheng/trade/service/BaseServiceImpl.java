package com.lecheng.trade.service;

import com.lecheng.trade.utils.HttpClientUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

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

    /**
     * 请求URL集合
     */
    @Resource
    protected HashMap<String, String> httpRequestMap;

    /**
     * 请求URL
     */
    protected String httpRequestUrl;

    public HttpClientUtils getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(HttpClientUtils httpClient) {
        this.httpClient = httpClient;
    }

    public HashMap<String, String> getHttpRequestMap() {
        return httpRequestMap;
    }

    public void setHttpRequestMap(HashMap<String, String> httpRequestMap) {
        this.httpRequestMap = httpRequestMap;
    }

    public String getHttpRequestUrl() {
        return httpRequestUrl;
    }

    public void setHttpRequestUrl(String httpRequestUrl) {
        this.httpRequestUrl = httpRequestUrl;
    }
}
