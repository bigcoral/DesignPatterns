package com.jingzhe.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 惊蛰
 * @date 2020/11/11 21:56
 */
public class TankLogHandler implements InvocationHandler {
    private Tank tank;

    public TankLogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start..");
        Object object = method.invoke(tank,args);
        System.out.println("method " + method.getName() + " end..");
        return object;
    }
}
