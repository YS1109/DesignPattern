package com.ysoztf.decorator;

public class CommonEntityDecorator implements CommonInterface {
    protected CommonInterface abstractEntity;

    public CommonInterface getAbstractEntity() {
        return abstractEntity;
    }

    public void setAbstractEntity(CommonInterface abstractEntity) {
        this.abstractEntity = abstractEntity;
    }

    @Override
    public void doSomething() {
        if (abstractEntity != null) {
            abstractEntity.doSomething();
        }
    }
}
