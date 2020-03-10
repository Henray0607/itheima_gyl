package com.itheima.gyl.test.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
    public static ApplicationContext context;
    static {
        context = new ClassPathXmlApplicationContext("com/itheima/gyl/spring/applicationContext.xml");
    }
}
