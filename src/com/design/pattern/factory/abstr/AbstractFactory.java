package com.design.pattern.factory.abstr;

import com.design.pattern.factory.pojo.Milk;

/**
 * Created by xujue on 2018/5/25
 */
public abstract class AbstractFactory {

    abstract Milk getMengNiu();

    abstract Milk getYiLi();
}
