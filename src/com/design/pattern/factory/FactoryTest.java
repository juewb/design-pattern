package com.design.pattern.factory;

import com.design.pattern.factory.func.Factory;
import com.design.pattern.factory.func.MengNiuFactory;
import com.design.pattern.factory.func.YiLiFactory;

/**
 * Created by xujue on 2018/5/25
 */
public class FactoryTest {

    public static void main(String[] args) {
        Factory mengNiuFactory = new MengNiuFactory();
        Factory yiliFactory = new YiLiFactory();

        System.out.println(mengNiuFactory.getMilk().getName());
        System.out.println(yiliFactory.getMilk().getName());
    }
}
