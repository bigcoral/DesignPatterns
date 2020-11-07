package com.jingzhe.factory.abstractfactory;

/**
 * @author 惊蛰
 * @date 2020/11/7 20:59
 */
public class Main {
    public static void main(String[] args) {
        AbstarctFactory abstarctFactory = new VehicleFactory();

        Vehicle car = abstarctFactory.createCar();
        car.run();

        Vehicle plane = abstarctFactory.createPlane();
        plane.run();
    }
}
