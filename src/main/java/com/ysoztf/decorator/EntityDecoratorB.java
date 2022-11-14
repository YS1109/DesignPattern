package com.ysoztf.decorator;

public class EntityDecoratorB extends CommonEntityDecorator{
    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("EntityDecoratorB do something");
    }
}
