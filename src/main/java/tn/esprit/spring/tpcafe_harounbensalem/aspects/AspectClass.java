package tn.esprit.spring.tpcafe_harounbensalem.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectClass {
//les méthodes :Advice

    @Before("execution(* tn.esprit.spring.tpcafe_harounbensalem.schedular..*.*(..))")
    public void logMethodEntry(JoinPoint jp){
        log.info("In method "+jp.getSignature().getName());
    }
    @After("execution(* tn.esprit.spring.tpcafe_harounbensalem.schedular..*.*(..))")
    public void logMethodEnd(JoinPoint jp){
        log.info("Out of method "+jp.getSignature().getName());
    }
    @Around("execution(* tn.esprit.spring.tpcafe_harounbensalem.schedular..*.*(..))")
    public Object logMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long end = System.currentTimeMillis() - start;
        log.info("Method  executed in "+ end + "ms");
        return obj;
    }

}
