package tn.esprit.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Component
@Aspect
public class LoggingAspect {
	
	@Before("execution(* tn.esprit.service..*.*(..))")
	public void logMethodEntry(JoinPoint joinPoint) {
	String name = joinPoint.getSignature().getName();
	log.info("In method: " + name );
	}
	
	@After("execution(* tn.esprit.service.classes.*.*(..))")
    public void logMethodAinseervicesonly(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("After method " + name + " : ");
    }
    @Around("execution(* tn.esprit.spring.service.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }

	
	
	
	
}
