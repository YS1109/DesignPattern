package com.ysoztf.proxy;

public class RealEntity implements CommonInterface{
    @Override
    public void doSomething() {
        System.out.println("realEntity do something");
    }
}
