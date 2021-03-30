package com.ysoztf.simple_factory;

import com.ysoztf.simple_factory.operation.*;

public class OperationFactory {
    public static Operation getOperation(char operationName) {
        switch (operationName) {
            case '+':
                return new AddOperation();
            case '-':
                return new SubtractOperation();
            case '*':
                return new MultiplyOperation();
            case '/':
                return new DivideOperation();
            default:
                return null;
        }
    }
}
