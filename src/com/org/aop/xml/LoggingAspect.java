package com.org.aop.xml;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Cwh
 * CreateTime 2019/7/13 13:27
 */
//把这个类声明为一个切面:需要把该类放入到IOC容器中，再声明一个切面

/**
 * 可以使用@Order 注解指定切面的优先级，值越小优先级越高
 *
 */

public class LoggingAspect {

    /**
     *定义一个方法，用于声明切入点表达式。一般的，该方法中再不需要添加其他代码
     * 使用@Pointcut来声明一个切入点表达式
     * 后面的其他通知直接使用方法名来引入当前的切入点表达式。
     *
     */
    public  void declareJointPointExpression(){

    }

    //声明该方法是一个前置通知：在目标方法开始之前执行

    public  void beforeMethod(JoinPoint joinPoint){

        String methodName = joinPoint.getSignature().getName();

        List<Object> args = Arrays.asList(joinPoint.getArgs());

        System.out.println("The methods " +  methodName +" begins with "+args);
    }

    //声明该方法的一个后置通知：在目标方法执行之后(无论是否发生异常)，执行的通知
    //在后置通知中还不能访问目标方法是执行结果

    public  void  afterMethod(JoinPoint joinPoint){

        String methodName = joinPoint.getSignature().getName();

        System.out.println("The methods " + methodName +" ends");
    }

    /**
     *
     * 在方法正常结束后执行的代码
     * 返回通知是可以访问到方法的返回值的
     */



    public void afterReturning(JoinPoint joinPoint,Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The methods " + methodName +" ends with "+ result);
    }

    /**
     *
     *在目标方法出现异常时会执行的代码
     * 可以访问到异常对象，且可以指定在出现特定异常时再执行代码
     */



    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The methods " + methodName +" occurs excetion: "+ e);
    }

   /**
     * 环绕通知需要携带ProceedingJoinPoint 类型的参数
     * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint 类型的参数可以决定是否执行目标方法
     * 且环绕通知必须有返回值，返回值即为目标方法的返回值
     *
     */
   /*

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){

        Object result =null;
        String methodName = proceedingJoinPoint.getSignature().getName();

        try {
            //前置通知
            System.out.println("The methods " +  methodName +" begins with "+Arrays.asList(proceedingJoinPoint.getArgs()));
            //执行方法
            result = proceedingJoinPoint.proceed();
            //返回通知
            System.out.println("The methods "+methodName+"  ends with "+ result);
        }catch (Throwable e){

            //异常通知
            System.out.println("The methods "+methodName+"  occurs exception :"+ e);
            throw new RuntimeException(e);
        }
            //后置通知
            System.out.println("The methods "+methodName+" ends");

        return result;
    }*/
}
