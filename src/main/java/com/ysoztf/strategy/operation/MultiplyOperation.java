package com.ysoztf.strategy.operation;

public class MultiplyOperation extends Operation{
    @Override
    public double getResult() {
        return getPreNum() * getLaterNum();
    }
}
