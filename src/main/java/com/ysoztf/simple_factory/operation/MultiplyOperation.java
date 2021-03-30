package com.ysoztf.simple_factory.operation;

public class MultiplyOperation extends Operation{
    @Override
    public double getResult() {
        return getPreNum() * getLaterNum();
    }
}
