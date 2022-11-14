package com.ysoztf.factory;

public class CommonEntityBFactory implements CommonFactoryInterface{
    @Override
    public CommonEntity createCommonEntity() {
        return new EntityB();
    }
}
