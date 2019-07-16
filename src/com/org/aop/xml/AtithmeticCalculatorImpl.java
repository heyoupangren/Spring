package com.org.aop.xml;

import org.springframework.stereotype.Component;

/**
 * @author Cwh
 * CreateTime 2019/7/13 12:10
 */
@Component("atithmeticCalculator")
public class AtithmeticCalculatorImpl implements AtithmeticCalculator {
    @Override
    public int add(int i, int j) {

        int result = i + j;

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result = i - j;

        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;

        return result;
    }
}
