package com.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Before("execution(* com.beans.*.*(..))")
    public void log(JoinPoint joinPoint){
        System.out.println("Logging for: "
                + joinPoint.getSignature().getName()
                + " on instance: "
                + joinPoint.getTarget().getClass().getName());
    }
}
