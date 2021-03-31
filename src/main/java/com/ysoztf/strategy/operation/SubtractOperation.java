package com.ysoztf.strategy.operation;

public class SubtractOperation extends Operation{

    @Override
    public double getResult() {
        return getPreNum() - getLaterNum();
    }
}
