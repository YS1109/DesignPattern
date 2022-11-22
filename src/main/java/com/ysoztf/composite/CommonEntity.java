package com.ysoztf.composite;

import java.util.Vector;

public abstract class CommonEntity {
    protected String name;

    public CommonEntity(String name) {
        this.name = name;
    }

    public abstract Vector<CommonEntity> getChildren();
    public abstract void add(CommonEntity commonEntity);
    public abstract void remove(CommonEntity commonEntity);
    public abstract void showChildren(int depth);
    public abstract void doSomething();
}
