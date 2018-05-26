package com.design.pattern.singleton.lazy;

/**
 * Created by xujue on 2018/5/25
 */
public class LazyOne {

    private static LazyOne instance = null;

    public LazyOne() {
    }

    public static LazyOne getInstance() {
        if (instance == null) {
            instance = new LazyOne();
        }
        return instance;
    }
}
