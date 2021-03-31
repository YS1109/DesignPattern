package com.ysoztf.strategy.operation;

public class DivideOperation extends Operation{
    @Override
    public double getResult() {
        return getPreNum() / getLaterNum();
    }
}
