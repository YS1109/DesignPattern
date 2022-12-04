package com.ysoztf.interpreter;

public class TerminalExpression implements Expression{
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
