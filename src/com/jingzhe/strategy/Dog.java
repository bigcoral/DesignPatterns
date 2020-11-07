package com.jingzhe.strategy;

/**
 * @author 惊蛰
 * @date 2020/11/7 15:19
 */
public class Dog{

    int weight,height;

    public Dog(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

}
