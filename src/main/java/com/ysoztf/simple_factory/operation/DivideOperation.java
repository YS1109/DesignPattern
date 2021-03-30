package com.ysoztf.simple_factory.operation;

public class DivideOperation extends Operation{
    @Override
    public double getResult() {
        return getPreNum() / getLaterNum();
    }
}
