package com.example.config.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ShapeAspect {

    @Around("execution(* getShapeArea(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Przed metodą " + pjp.getSignature().getName());
        return pjp.proceed();
    }
}
