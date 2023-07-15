package com.example.aspect;

import com.example.model.Shape;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ShapeAspect {
    @Autowired
    private Shape shape;

    @Around("execution(* getArea(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("Przed metodą " +  pjp.getSignature().getName()+ " figury "+ shape);
        return pjp.proceed();
    }
}
