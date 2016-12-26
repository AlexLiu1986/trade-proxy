package com.lecheng.trade.annotation.impl;

import com.lecheng.trade.annotation.HttpRequest;
import com.lecheng.trade.utils.SpringContextUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * 功能: 注解实现类
 * 创建: liuchongguang
 * 日期: 2016/12/26 0026 10:34
 * 版本: V1.0
 */
@Aspect
public class HttpRequestAdvice {

    private static Logger logger = LoggerFactory.getLogger(HttpRequestAdvice.class);

    /**
     * 定义Pointcut，Pointcut的名称 就是simplePointcut，此方法不能有返回值，该方法只是一个标示
     */
    @Pointcut("@annotation(com.lecheng.trade.annotation.HttpRequest)")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) {
        Object object = null;
        try {
            Signature sig = pjp.getSignature();
            MethodSignature msig = (MethodSignature) sig;
            Object target = pjp.getTarget();
            Method method = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
            if (null != method) {
                HttpRequest httpRequest = method.getAnnotation(HttpRequest.class);
                HashMap<String, String> map = SpringContextUtils.getBean(httpRequest.map(), HashMap.class);
                String url = map.get(httpRequest.name());
                Method m = target.getClass().getMethod("setHttpRequestUrl", String.class);
                m.invoke(target, url);
            }
            object = pjp.proceed();
        } catch (Throwable e) {
            logger.error("HttpRequestAdvice.around异常", e);
        }
        return object;
    }
}
