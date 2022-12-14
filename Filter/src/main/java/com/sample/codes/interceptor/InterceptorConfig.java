package com.sample.codes.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(new SampleInterceptor())
                 .order(1)
                 .addPathPatterns("/**")
                 .excludePathPatterns("/css/**", "/js/**", "/something");
    }
}
