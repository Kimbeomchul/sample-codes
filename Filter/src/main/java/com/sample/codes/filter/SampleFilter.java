package com.sample.codes.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * packageName : com.sample.codes.filter
 * fileName : SampleFilter
 * author : kimbeomchul
 * date : 2022/11/01
 * description :
 * ===========================================================
 * DATE    AUTHOR    NOTE
 * -----------------------------------------------------------
 * 2022/11/01 kimbeomchul 최초 생성
 */

@Slf4j
public class SampleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        String requestURI = httpRequest.getRequestURI();

        try{
            if(PatternMatchUtils.simpleMatch("/someURL", requestURI)){
                // ...
            }
            chain.doFilter(request, response); // do next
        }catch(Exception e) {
            log.error("...");
            throw e;
        }
    }
}
