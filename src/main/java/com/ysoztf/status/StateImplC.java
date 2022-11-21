package com.ysoztf.status;

public class StateImplC implements State {
    @Override
    public void writeCurrentState(Entity entity) {
        System.out.println("state C：work's value >= 10");
    }
}
