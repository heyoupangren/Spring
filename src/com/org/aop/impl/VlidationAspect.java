package com.org.aop.impl;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Cwh
 * CreateTime 2019/7/13 15:12
 */
@Order(1)
@Aspect
@Component
public class VlidationAspect {

    @Before("LoggingAspect.declareJointPointExpression()")
    public void validationArgs(JoinPoint joinPoint){
        System.out.println("Validation:"+ Arrays.asList(joinPoint.getArgs()));
    }
}
