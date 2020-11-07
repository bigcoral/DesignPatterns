package com.jingzhe.singleton;


/**
 * @author 惊蛰
 * @date 2020/11/7 14:06
 * 饿汉式
 * 类加载到内存以后，就实例化一个单例，JVM保证线程安全
 * 缺点:不管有没有用到，类加载时就完成实例化
 * 优点:简单实用
 */
public class Demo01 {
    private static final Demo01 INSTANCE = new Demo01();

    private Demo01(){};

    public static Demo01 getInstance(){
        return INSTANCE;
    }

}
