package com.ysoztf.bridge;

public class RefinedAbstractionA extends Abstraction{
    private String name;

    public RefinedAbstractionA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        implementor.operation();
        System.out.println("from " + name);
    }
}
