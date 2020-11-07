package com.jingzhe.factory;

/**
 * @author 惊蛰
 * @date 2020/11/7 20:00
 * 简单工厂
 * 缺点:扩展性不好
 */
public class SimpleFactory {

    public Car createCar(){
        //前置业务操作
        return new Car();
    }

    public Plane createPlane(){
        //前置业务操作
        return new Plane();
    }
}
