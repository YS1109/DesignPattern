package com.ysoztf.simple_factory.operation;

public class SubtractOperation extends Operation{

    @Override
    public double getResult() {
        return getPreNum() - getLaterNum();
    }
}
