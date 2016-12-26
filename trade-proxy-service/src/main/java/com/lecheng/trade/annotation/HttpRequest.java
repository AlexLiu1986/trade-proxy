package com.lecheng.trade.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能: 请求参数注解
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 10:03
 * 版本: V1.0
 */
@Retention(RetentionPolicy.RUNTIME)//注解会在class中存在，运行时可通过反射获取
@Target(ElementType.METHOD)//目标是方法
public @interface HttpRequest {

    /**
     * 请求参数所在MAP的ID
     *
     * @return
     */
    String map() default "httpRequestMap";

    /**
     * 请求参数所在MAP的KEY
     *
     * @return
     */
    String name() default "";
}
