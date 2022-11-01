package com.sample.codes.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * packageName : com.sample.codes.aop
 * fileName : AopConfig
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
public class AopConfig {

    @Bean
    public TimeAop timeAop() {
        return new TimeAop();
    }

}
