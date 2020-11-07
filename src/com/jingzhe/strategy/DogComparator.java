package com.jingzhe.strategy;

/**
 * @author 惊蛰
 * @date 2020/11/7 16:09
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog t1, Dog t2) {
        if(t1.weight<t2.weight)
            return -1;
        else if(t1.weight>t2.weight)
            return  1;
        return 0;
    }
}
