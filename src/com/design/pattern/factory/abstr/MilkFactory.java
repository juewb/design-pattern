package com.design.pattern.factory.abstr;

import com.design.pattern.factory.pojo.MengNiu;
import com.design.pattern.factory.pojo.Milk;
import com.design.pattern.factory.pojo.Yili;

/**
 * Created by xujue on 2018/5/25
 */
public class MilkFactory extends AbstractFactory {

    @Override
    public Milk getMengNiu() {
        return new MengNiu();
    }

    @Override
    public Milk getYiLi() {
        return new Yili();
    }
}
