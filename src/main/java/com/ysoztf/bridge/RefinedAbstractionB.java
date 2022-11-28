package com.ysoztf.bridge;

public class RefinedAbstractionB extends Abstraction{

    @Override
    public void operation() {
        implementor.operation();
        System.out.println("from B");
    }
}
