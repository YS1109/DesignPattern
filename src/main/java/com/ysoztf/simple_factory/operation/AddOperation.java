package com.ysoztf.simple_factory.operation;

public class AddOperation extends Operation{
    @Override
    public double getResult() {
        return getPreNum() + getLaterNum();
    }
}
