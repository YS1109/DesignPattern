package com.ysoztf.proxy;

public class ProxyEntity implements CommonInterface{
    private RealEntity realEntity;

    @Override
    public void doSomething() {
        if (realEntity == null) {
            realEntity = new RealEntity();
        }
        realEntity.doSomething();
    }
}
