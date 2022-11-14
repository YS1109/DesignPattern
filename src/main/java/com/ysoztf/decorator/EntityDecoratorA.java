package com.ysoztf.decorator;

public class EntityDecoratorA extends CommonEntityDecorator{
    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("EntityDecoratorA do something");
    }
}
