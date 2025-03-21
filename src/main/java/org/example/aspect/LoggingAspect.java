package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

    // 环绕通知计算方法执行时间
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed(); // 执行目标方法
        long duration = System.currentTimeMillis() - start;
        System.out.printf("方法 %s 执行耗时: %dms\n",
                joinPoint.getSignature().getName(), duration);
        return result;
    }
}
