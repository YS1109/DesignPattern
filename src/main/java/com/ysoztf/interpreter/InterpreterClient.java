package com.ysoztf.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterClient {
    public static void main(String[] args) {
        Context context = new Context();
        List<Expression> expressionList = new ArrayList<>();
        expressionList.add(new TerminalExpression());
        expressionList.add(new NonterminalExpression());
        expressionList.add(new TerminalExpression());
        expressionList.add(new TerminalExpression());

        for (Expression expression : expressionList) {
            expression.interpret(context);
        }
    }
}
