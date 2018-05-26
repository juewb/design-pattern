package com.design.pattern.factory;

import com.design.pattern.factory.abstr.MilkFactory;

/**
 * Created by xujue on 2018/5/25
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        MilkFactory factory = new MilkFactory();

        System.out.println(factory.getMengNiu().getName());
        System.out.println(factory.getYiLi().getName());
    }
}
