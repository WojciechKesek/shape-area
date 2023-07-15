package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ShapeAspect {

    @Around("execution(* getArea(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Dla figury " +  pjp.getSourceLocation().getWithinType().getSimpleName());
        return pjp.proceed();
    }
}
