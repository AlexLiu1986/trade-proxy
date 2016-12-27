package com.lecheng.trade.utils;

import net.sf.json.JSONObject;

/**
 * 功能: JSON工具类
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 12:18
 * 版本: V1.0
 */
public class JsonUtils {

    /**
     * 安全获取json内容
     *
     * @param object
     * @param key
     * @return
     */
    public static String getString(JSONObject object, String key) {
        try {
            return object.getString(key);
        } catch (Exception e) {
            return null;
        }
    }
}
