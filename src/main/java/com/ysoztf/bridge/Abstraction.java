package com.ysoztf.bridge;

public abstract class Abstraction {
    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();

}
