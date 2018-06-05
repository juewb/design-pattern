package com.design.pattern.proxy.staticed;

/**
 * 目标对象
 */
public class Son implements Person{

    @Override
    public void findLove(){

        //我没有时间
        //工作忙
        System.out.println("找对象，肤白貌美大长腿");
    }

    @Override
    public void findJob(){

    }
}
