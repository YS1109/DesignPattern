package com.ysoztf.simple_factory.operation;

public abstract class Operation {
    private double preNum;
    private double laterNum;

    public double getPreNum() {
        return preNum;
    }

    public void setPreNum(double preNum) {
        this.preNum = preNum;
    }

    public double getLaterNum() {
        return laterNum;
    }

    public void setLaterNum(double laterNum) {
        this.laterNum = laterNum;
    }

    public abstract double getResult();
}
