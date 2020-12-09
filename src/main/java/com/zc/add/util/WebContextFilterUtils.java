package com.zc.add.util;

import javax.servlet.http.HttpServletRequest;
/**
 * 动态获取requestde的工具类
 */
public class WebContextFilterUtils {

    private static ThreadLocal<HttpServletRequest> threadLocal = new ThreadLocal<>();

    public static void setRequest(HttpServletRequest request){
            threadLocal.set(request);
    }

    public static HttpServletRequest getRequest(){
        return threadLocal.get();
    }

    public static void remove(){
        threadLocal.remove();
    }
}
