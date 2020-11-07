package com.jingzhe.strategy;

import java.util.Arrays;

/**
 * @author 惊蛰
 * @date 2020/11/7 15:07
 */
public class Main {

    public static void main(String[] args) {
        Dog[] dogs =
                {new Dog(9,9),new Dog(3,3),new Dog(7,7)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(dogs,new DogComparator());
        System.out.println(Arrays.toString(dogs));
    }
}
