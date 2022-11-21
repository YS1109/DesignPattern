package com.ysoztf.status;

public class StateImplB implements State {
    @Override
    public void writeCurrentState(Entity entity) {
        if (entity.getValue() < 10) {
            System.out.println("state B：work's value >= 0 and value < 10");
            return;
        }
        StateImplC stateImplC = new StateImplC();
        entity.setState(stateImplC);
        entity.writeCurrentState();
    }
}
