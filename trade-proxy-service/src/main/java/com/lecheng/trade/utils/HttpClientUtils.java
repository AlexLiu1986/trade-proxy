package com.lecheng.trade.utils;

import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    /**
     * 模拟Post请求
     *
     * @param url
     * @param params
     * @return
     */
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
                //return "{\"AccountFlowList\":[{\"ID\":10,\"FlowType\":4,\"FlowName\":\"平仓\",\"InOut\":1,\"Amount\":247.00,\"AccountBalance\":98059.30,\"FlowTime\":\"2016-08-04T09:05:41.25\",\"Comment\":null},{\"ID\":9,\"FlowType\":3,\"FlowName\":\"建仓\",\"InOut\":2,\"Amount\":274.00,\"AccountBalance\":97812.30,\"FlowTime\":\"2016-08-03T10:24:06.023\",\"Comment\":null},{\"ID\":8,\"FlowType\":4,\"FlowName\":\"平仓\",\"InOut\":1,\"Amount\":400.00,\"AccountBalance\":98086.30,\"FlowTime\":\"2016-08-03T04:15:00.743\",\"Comment\":null},{\"ID\":7,\"FlowType\":4,\"FlowName\":\"平仓\",\"InOut\":1,\"Amount\":30000.00,\"AccountBalance\":97686.30,\"FlowTime\":\"2016-08-03T04:15:00.743\",\"Comment\":null},{\"ID\":6,\"FlowType\":4,\"FlowName\":\"平仓\",\"InOut\":1,\"Amount\":8.00,\"AccountBalance\":67686.30,\"FlowTime\":\"2016-08-03T04:15:00.743\",\"Comment\":null},{\"ID\":5,\"FlowType\":4,\"FlowName\":\"平仓\",\"InOut\":1,\"Amount\":5000.00,\"AccountBalance\":67678.30,\"FlowTime\":\"2016-08-03T04:15:00.743\",\"Comment\":null},{\"ID\":4,\"FlowType\":3,\"FlowName\":\"建仓\",\"InOut\":2,\"Amount\":438.00,\"AccountBalance\":62678.30,\"FlowTime\":\"2016-08-02T18:18:47.713\",\"Comment\":null},{\"ID\":3,\"FlowType\":3,\"FlowName\":\"建仓\",\"InOut\":2,\"Amount\":31500.00,\"AccountBalance\":63116.30,\"FlowTime\":\"2016-08-02T18:17:13.527\",\"Comment\":null},{\"ID\":2,\"FlowType\":3,\"FlowName\":\"建仓\",\"InOut\":2,\"Amount\":8.70,\"AccountBalance\":94616.30,\"FlowTime\":\"2016-08-02T12:09:07.647\",\"Comment\":null},{\"ID\":1,\"FlowType\":3,\"FlowName\":\"建仓\",\"InOut\":2,\"Amount\":5375.00,\"AccountBalance\":94625.00,\"FlowTime\":\"2016-08-02T11:26:51.79\",\"Comment\":null}],\"ResultCD\":\"I001\",\"ErrorMsg\":null}\n";
                //return "{\"AccountFlowDetail\":{\"ID\":1,\"CustomerId\":3,\"FlowType\":3,\"FlowName\":\"建仓\",\"InOut\":2,\"Amount\":5375.00,\"AccountBalance\":94625.00,\"FlowTime\":\"2016-08-02T11:26:51.79\",\"Comment\":null,\"DepositType\":null,\"DepositName\":\"\",\"Bank\":null,\"CardNo\":\"\",\"Name\":null,\"Status\":0,\"WithdrawAmount\":0.0,\"WithdrawCharge\":0.0,\"GoodsName\":\"50kg吉银\",\"BuySell\":1,\"PositionAmount\":1.0,\"OpenPrice\":4000.00,\"PositionTime\":\"2016-08-02T11:26:51.79\",\"OpenCost\":5000.00,\"OpenCharge\":375.00,\"ClosePrice\":4000.0000,\"CloseTime\":\"2016-08-03T04:15:00.743\",\"CloseIncome\":5000.0000,\"CloseCharge\":0.0000,\"CloseType\":4,\"CloseTypeName\":\"收盘平仓\",\"Title\":null},\"ResultCD\":\"I001\",\"ErrorMsg\":null}\n";
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
     * 模拟Get请求
     *
     * @param url
     * @param params
     * @return
     */
    public String doGet(String url, String params) {
        CloseableHttpClient client = createCloseableHttpClient(url);
        try {
            if (StringUtils.isNotBlank(params)) {
                url += "?" + params;
            }
            HttpGet httpGet = new HttpGet(url);
            httpGet.addHeader("Connection", "Keep-Alive");
            httpGet.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
            httpGet.addHeader("Cookie", "");

            HttpResponse resp = client.execute(httpGet);
            if (resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity he = resp.getEntity();
                return EntityUtils.toString(he, this.contentEncoding);
            }
            return null;
        } catch (Exception e) {
            logger.error("HttpClientUtils doGet异常", e);
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
     * 模拟Get请求
     *
     * @param url
     * @param paramMap
     * @return
     */
    public String doGet(String url, Map<String, String> paramMap) {
        try {
            String paramStr = "";
            if (paramMap != null) {
                //封装请求参数
                List<NameValuePair> params = new ArrayList<>();
                for (String key : paramMap.keySet()) {
                    params.add(new BasicNameValuePair(key, paramMap.get(key)));
                }
                paramStr = EntityUtils.toString(new UrlEncodedFormEntity(params, this.contentEncoding));
            }
            return doGet(url, paramStr);
        } catch (Exception e) {
            logger.error("HttpClientUtils doGet异常", e);
        }
        return null;
    }

    /**
     * 模拟Post请求
     *
     * @param url
     * @param params
     * @return
     */
    public JSONObject doJsonPost(String url, String params) {
        try {
            return JSONObject.fromObject(doPost(url, params));
        } catch (Exception e) {
            logger.error("doJsonPost异常", e);
        }
        return null;
    }

    /**
     * 模拟Get请求
     *
     * @param url
     * @param params
     * @return
     */
    public JSONObject doJsonGet(String url, String params) {
        try {
            return JSONObject.fromObject(doGet(url, params));
        } catch (Exception e) {
            logger.error("doJsonGet异常", e);
        }
        return null;
    }

    /**
     * 模拟Get请求
     *
     * @param url
     * @param paramMap
     * @return
     */
    public JSONObject doJsonGet(String url, Map<String, String> paramMap) {
        try {
            return JSONObject.fromObject(doGet(url, paramMap));
        } catch (Exception e) {
            logger.error("doJsonGet异常", e);
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
