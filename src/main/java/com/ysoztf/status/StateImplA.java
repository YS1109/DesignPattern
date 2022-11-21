package com.ysoztf.status;

public class StateImplA implements State {
    @Override
    public void writeCurrentState(Entity entity) {
        if (entity.getValue() < 0) {
            System.out.println("state A：work's value < 0");
            return;
        }
        StateImplB stateImplB = new StateImplB();
        entity.setState(stateImplB);
        entity.writeCurrentState();
    }
}
