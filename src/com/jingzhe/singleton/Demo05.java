package com.jingzhe.singleton;

/**
 * @author 惊蛰
 * @date 2020/11/7 14:42
 * Effective Java 枚举写法 完美写法之一
 * 防止反射破坏单例，防止反序列化
 * 枚举类没有构造方法
 */
public enum Demo05 {
    INSTANCE;
}
