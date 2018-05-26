package com.design.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xujue on 2018/5/25
 */
public class BeanFactory {

    public BeanFactory() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getBean(String className) {
        if (className == null || "".equals(className)) {
            return null;
        }
        if (ioc.get(className) == null) {
            Object obj = null;
            try {
                obj = Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            ioc.put(className, obj);
            return obj;
        }
        return ioc.get(className);
    }
}
