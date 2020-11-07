package com.jingzhe.singleton;

/**
 * @author 惊蛰
 * @date 2020/11/7 14:37
 * 完美写法之一
 * 静态内部类写法 JVM保证线程安全 只加载一次class
 * 加载外部类不会加载内部类，从而实现懒加载
 */
public class Demo04 {

    private Demo04(){}

    private static class Demo04Holder{
        private final static Demo04 INSTANCE = new Demo04();
    }

    public static Demo04 getInstance(){
        return Demo04Holder.INSTANCE;
    }
}
