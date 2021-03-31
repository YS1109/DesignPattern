package com.ysoztf.strategy;

import com.ysoztf.strategy.operation.*;

public class OperationContext {
    private Operation operation;

    public OperationContext(String strategy) {
        setOperation(strategy);
    }

    public void setOperation(String strategy) {
        switch (strategy) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubtractOperation();
                break;
            case "*":
                operation = new MultiplyOperation();
                break;
            case "/":
                operation = new DivideOperation();
                break;
            default:
                operation = null;
                break;
        }
    }

    public double getResult(double preNum, double laterNum) {
        operation.setPreNum(preNum);
        operation.setLaterNum(laterNum);
        return operation.getResult();
    }
}
