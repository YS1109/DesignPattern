package com.ysoztf.visitor;

public class ConcreteVisitorA implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteElementA 被 ConcreteVisitorA 访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteElementB 被 ConcreteVisitorA 访问");
    }
}
