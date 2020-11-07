package com.jingzhe.factory.abstractfactory;

/**
 * @author 惊蛰
 * @date 2020/11/7 20:58
 */
public class VehicleFactory extends AbstarctFactory {
    @Override
    Car createCar() {
        return new Car();
    }

    @Override
    Plane createPlane() {
        return new Plane();
    }
}
