package com.ysoztf.status;

public class Entity {
    private int value;
    private State state;

    public Entity() {
        this.state = new StateImplA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void writeCurrentState() {
        state.writeCurrentState(this);
    }
}
