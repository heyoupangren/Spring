package com.org.aop.first;

/**
 * @author Cwh
 * CreateTime 2019/7/13 12:15
 */
public class Main {
    public static void main(String[] args) {

       /* AtithmeticCalculator atithmeticCalculator =null;
        atithmeticCalculator = new AtithmeticCalculatorImpl();*/


       AtithmeticCalculator target =new AtithmeticCalculatorImpl();
       AtithmeticCalculator proxy = new AtithmeticCalculatorLoggingProxy(target).getLoggingProxy();
        int result = proxy.add(1,2);

        System.out.println("-->"+result);

        result =proxy.div(4,2);

        System.out.println("-->"+result);
    }
}
