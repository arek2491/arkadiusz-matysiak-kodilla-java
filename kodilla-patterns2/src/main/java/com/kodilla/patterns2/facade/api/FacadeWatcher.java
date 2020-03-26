package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + " && args(order, userId) && target(object)")
    private void logEvent(OrderDto order, Object object, Long userId) {
        LOGGER.info("Starting processOrder! Class: " + object.getClass().getName() + ", Order: " + order + ", User ID: " + userId);
    }
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long start = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long stop = System.currentTimeMillis();
            LOGGER.info("Time Consumed: " + (stop - start) + "ms");
        }catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
