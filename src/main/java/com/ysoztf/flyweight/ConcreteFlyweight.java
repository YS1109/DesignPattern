package com.ysoztf.flyweight;

public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int value) {
        System.out.println("ConcreteFlyweight get value:" + value);
    }
}
