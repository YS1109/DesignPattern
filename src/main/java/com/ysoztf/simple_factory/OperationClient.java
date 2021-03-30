package com.ysoztf.simple_factory;

import com.ysoztf.simple_factory.operation.Operation;

import java.util.Random;

public class OperationClient {
    public static void main(String[] args) {
        char[] symbolArray = {'+', '-', '*', '/'};
        Random random = new Random();
        char symbol = symbolArray[random.nextInt(4)];
        Operation operation = OperationFactory.getOperation(symbol);
        operation.setPreNum(random.nextDouble() * 100);
        operation.setLaterNum(random.nextDouble() * 100);
        System.out.println(operation.getPreNum() + " " + symbol + " " + operation.getLaterNum() + " = " + operation.getResult());
    }
}
