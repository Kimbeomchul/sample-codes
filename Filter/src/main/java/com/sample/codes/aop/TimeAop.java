package com.sample.codes.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * packageName : com.sample.codes.aop
 * fileName : TimeAop
 * author : kimbeomchul
 * date : 2022/11/01
 * description :
 * ===========================================================
 * DATE    AUTHOR    NOTE
 * -----------------------------------------------------------
 * 2022/11/01 kimbeomchul 최초 생성
 */

@Slf4j
@Aspect
public class TimeAop {

    @Pointcut("execution(* com.sample.codes..*(..))")
    public void allPointcut() {}

    // 작동시간을 찍는 AOP
    // allPointcut()
    @Around("@annotation(com.sample.codes.aop.TimeLog)")
    public Object timeLogger(ProceedingJoinPoint joinPoint) throws Throwable {

        long bfTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long afTime = System.currentTimeMillis();

        long response = (afTime - bfTime)/1000;
        log.info("[Response time] = {}초", response);

        if (response >= 10){
            log.warn("[Delayed Response time] = {}, {}초", joinPoint.getSignature(), response);
        }
        return proceed;
    }

}
