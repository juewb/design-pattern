package com.design.pattern.singleton.lazy;

/**
 * Created by xujue on 2018/5/25
 */
public class LazyTwo {

    private static LazyTwo instance = null;

    public LazyTwo() {
    }

    public static synchronized LazyTwo getInstance() {
        if (instance == null) {
            instance = new LazyTwo();
        }
        return instance;
    }
}
