package com.jingzhe.singleton;

/**
 * @author 惊蛰
 * @date 2020/11/7 14:33
 * 懒汉式
 * 比较完美的写法
 */
public class Demo03 {
    //要加volatile来禁止JVM 指令重排
    private static volatile Demo03 INSTATNCE;

    private Demo03(){}

    public static Demo03 getInstance(){
        if(INSTATNCE==null){
            //双重检查机制
            synchronized (Demo03.class){
                if(INSTATNCE==null){
                    INSTATNCE = new Demo03();
                }
            }
        }
        return INSTATNCE;
    }
}
