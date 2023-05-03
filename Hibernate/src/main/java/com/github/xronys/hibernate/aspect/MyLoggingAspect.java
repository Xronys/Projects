package com.github.xronys.hibernate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {

        @Around("execution(* com.github.xronys.hibernate.*.*(..))")
                public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJointPoint) throws Throwable{

            MethodSignature methodSignature = (MethodSignature) proceedingJointPoint.getSignature();
            String methodName = methodSignature.getName();

            System.out.println("Begin of " + methodName);

            Object targetMethodResult = proceedingJointPoint.proceed();

            System.out.println("End of " + methodName);
            return targetMethodResult;

    }
}
