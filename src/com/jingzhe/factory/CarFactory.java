package com.jingzhe.factory;

/**
 * @author 惊蛰
 * @date 2020/11/7 20:05
 */
public class CarFactory {

    public Car createCar(){
        //前置业务操作
        return new Car();
    }
}
