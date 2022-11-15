package com.ysoztf.facade;

public class FacadeEntity {
    private EntityA entityA;
    private EntityB entityB;
    private EntityC entityC;

    public FacadeEntity() {
        entityA = new EntityA();
        entityB = new EntityB();
        entityC = new EntityC();
    }

    public void methodA() {
        entityA.methodA();
        entityB.methodC();
        entityC.methodB();
    }

    public void methodB() {
        entityA.methodC();
        entityB.methodC();
        entityC.methodC();
    }

    public void methodC() {
        entityA.methodA();
        entityB.methodC();
    }
}
