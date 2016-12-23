package com.lecheng.trade.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * 功能: http请求工具类
 * 创建: liuchongguang
 * 日期: 2016/12/23 0023 15:48
 * 版本: V1.0
 */
public class HttpClientUtils {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(HttpClientUtils.class);

    /**
     * ContentEncoding,默认utf-8
     */
    private String contentEncoding = "utf-8";

    /**
     * ContentType,默认application/json
     */
    private String contentType = "application/json";

    public String doPost(String url, String params) {
        CloseableHttpClient client = createCloseableHttpClient(url);
        try {
            HttpPost httpPost = new HttpPost(url);
            StringEntity entity = new StringEntity(params, this.contentEncoding);//解决中文乱码问题
            entity.setContentEncoding(this.contentEncoding);
            entity.setContentType(this.contentType);
            httpPost.setEntity(entity);

            HttpResponse resp = client.execute(httpPost);
            if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity he = resp.getEntity();
                return EntityUtils.toString(he, this.contentEncoding);
            }
            return null;
        } catch (Exception e) {
            logger.error("HttpClientUtils doPost异常", e);
        } finally {
            try {
                if (client != null) {
                    client.close();
                }
            } catch (Exception e) {
                logger.error("HttpClient关闭异常", e);
            }
        }
        return null;
    }

    /**
     * 创建HttpClient
     *
     * @return
     */
    private CloseableHttpClient createCloseableHttpClient(String url) {
        try {
            if (url.startsWith("https")) {
                SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                    //信任所有
                    public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                        return true;
                    }
                }).build();
                SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);
                return HttpClients.custom().setSSLSocketFactory(sslsf).build();
            } else {
                return HttpClients.createDefault();
            }
        } catch (Exception e) {
            logger.error("创建CloseableHttpClient异常", e);
        }
        return null;
    }

    public String getContentEncoding() {
        return contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
