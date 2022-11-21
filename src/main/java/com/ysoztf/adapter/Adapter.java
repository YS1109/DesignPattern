package com.ysoztf.adapter;

public class Adapter extends TargetEntity{
    private SpecialEntity specialEntity;

    public Adapter(SpecialEntity specialEntity) {
        this.specialEntity = specialEntity;
    }

    public SpecialEntity getSpecialEntity() {
        return specialEntity;
    }

    public void setSpecialEntity(SpecialEntity specialEntity) {
        this.specialEntity = specialEntity;
    }

    @Override
    public void request() {
        specialEntity.specialRequest();
    }
}
