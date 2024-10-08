package com.neu.edu.stocktrading.util;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

public class HeaderInterceptorUtil implements HandlerInterceptor {
    private static Logger log = LoggerFactory.getLogger(HeaderInterceptorUtil.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
     
    log.info("[" + request.getRequestURI() + "]" + "[" + request.getMethod()
      + "]" );
      response.setHeader("Cache-Control","no-cache");
             response.setHeader("Cache-Control","no-store");
             response.setHeader("Pragma","no-cache");
             response.setDateHeader ("Expires",0);
     
    return true;
}


}