package com.jingzhe.singleton;

/**
 * @author 惊蛰
 * @date 2020/11/7 14:17
 * 懒汉式
 * 优点:用的时候才实例化
 * 缺点:多线程不安全
 */
public class Demo02 {
    private static Demo02 INSTATNCE;

    private Demo02(){}

    public static Demo02 getInstance(){
        if(INSTATNCE==null){
            INSTATNCE = new Demo02();
        }
        return INSTATNCE;
    }
}
