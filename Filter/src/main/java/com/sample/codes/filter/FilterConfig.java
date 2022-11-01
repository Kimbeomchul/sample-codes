package com.sample.codes.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;


/**
 * packageName : com.sample.codes.filter
 * fileName : FilterConfig
 * author : kimbeomchul
 * date : 2022/11/01
 * description :
 * ===========================================================
 * DATE    AUTHOR    NOTE
 * -----------------------------------------------------------
 * 2022/11/01 kimbeomchul 최초 생성
 */

@Slf4j
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean someFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new SampleFilter());
        filterFilterRegistrationBean.setOrder(1);
        filterFilterRegistrationBean.addUrlPatterns("/*");
        return filterFilterRegistrationBean;
    }
}
