package com.ysoztf.factory;

public class CommonEntityAFactory implements CommonFactoryInterface{
    @Override
    public CommonEntity createCommonEntity() {
        return new EntityA();
    }
}
