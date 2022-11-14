package com.ysoztf.factory;

public class CommonEntityFactory implements CommonFactoryInterface{
    @Override
    public CommonEntity createCommonEntity() {
        return new CommonEntity();
    }
}
