package com.ysoztf.decorator;

public abstract class CommonEntityDecorator extends AbstractEntity{
    protected AbstractEntity abstractEntity;

    public AbstractEntity getAbstractEntity() {
        return abstractEntity;
    }

    public void setAbstractEntity(AbstractEntity abstractEntity) {
        this.abstractEntity = abstractEntity;
    }

    @Override
    public void doSomething() {
        if (abstractEntity != null) {
            abstractEntity.doSomething();
        }
    }
}
