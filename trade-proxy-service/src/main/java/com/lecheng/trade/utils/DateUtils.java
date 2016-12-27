package com.lecheng.trade.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 功能: 日期工具类
 * 创建: liuchongguang
 * 日期: 2016/12/27 0027 19:03
 * 版本: V1.0
 */
public class DateUtils {

    /**
     * 日志记录器
     */
    private static Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public final static String DEFAULT_DATA_FORMAT = "yyyy-MM-dd";

    public final static String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd hh:mm:ss";

    public final static String DEFAULT_TIMESTAMP_FORMAT = "yyyy-MM-dd hh:mm:ss.SS";

    /**
     * 获取当前系统时间
     *
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 转换日期
     *
     * @param str
     * @param format
     * @return
     */
    public static Date parse(String str, String format) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.parse(str);
        } catch (Exception e) {
            logger.error(String.format("将日期%s按格式%s转换为日期失败", str, format), e);
        }
        return null;
    }

    /**
     * 格式化日期
     *
     * @param date
     * @param format
     * @return
     */
    public static String format(Date date, String format) {
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(date);
        } catch (Exception e) {
            logger.error(String.format("将日期按格式%s格式化失败", format), e);
        }
        return null;
    }
}
