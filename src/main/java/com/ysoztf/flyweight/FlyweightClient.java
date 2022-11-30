package com.ysoztf.flyweight;

public class FlyweightClient {
    public static void main(String[] args) {
        int value = 22;

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight fx = factory.getFlyweightByKey("X");
        fx.operation(--value);

        Flyweight fy = factory.getFlyweightByKey("Y");
        fy.operation(--value);

        Flyweight fz = factory.getFlyweightByKey("Z");
        fz.operation(--value);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--value);
    }
}
