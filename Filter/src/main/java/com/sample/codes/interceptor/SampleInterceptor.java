package com.sample.codes.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * packageName : com.sample.codes.interceptor
 * fileName : SampleInterceptor
 * author : kimbeomchul
 * date : 2022/11/01
 * description :
 * ===========================================================
 * DATE    AUTHOR    NOTE
 * -----------------------------------------------------------
 * 2022/11/01 kimbeomchul 최초 생성
 */

@Slf4j
public class SampleInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // ...
        log.info("### preHandle ###");
        log.info("cookies = {} ", request.getCookies());
        log.info("dispatcherType = {}", request.getDispatcherType());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        log.info("### postHandle ###");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        log.info("### afterCompletion ###");
    }
}
