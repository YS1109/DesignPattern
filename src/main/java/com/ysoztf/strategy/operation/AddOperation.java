package com.ysoztf.strategy.operation;

public class AddOperation extends Operation{
    @Override
    public double getResult() {
        return getPreNum() + getLaterNum();
    }
}
