package com.ysoztf.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int value) {
        System.out.println("UnsharedConcreteFlyweight receive value:" + value);
    }
}
