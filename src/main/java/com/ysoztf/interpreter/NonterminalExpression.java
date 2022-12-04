package com.ysoztf.interpreter;

public class NonterminalExpression implements Expression{
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
