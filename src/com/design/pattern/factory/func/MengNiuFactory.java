package com.design.pattern.factory.func;

import com.design.pattern.factory.pojo.MengNiu;
import com.design.pattern.factory.pojo.Milk;

/**
 * Created by xujue on 2018/5/25
 */
public class MengNiuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new MengNiu();
    }
}
