package com.ysoztf.strategy;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

public class OperationClient {
    public static void main(String[] args) {
        List<String> symbolList = Lists.newArrayList("+", "-", "*", "/");
        Random random = new Random();
        String symbol = symbolList.get(random.nextInt(4));
        OperationContext context = new OperationContext(symbol);
        double preNum = random.nextDouble() * 100;
        double laterNum = random.nextDouble() * 100;
        double result = context.getResult(preNum, laterNum);
        System.out.println(preNum + " " + symbol + " " + laterNum + " = " + result);
    }
}
