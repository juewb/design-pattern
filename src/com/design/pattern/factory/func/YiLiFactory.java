package com.design.pattern.factory.func;

import com.design.pattern.factory.pojo.Milk;
import com.design.pattern.factory.pojo.Yili;

/**
 * Created by xujue on 2018/5/25
 */
public class YiLiFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
