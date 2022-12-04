package com.ysoztf.visitor;

public class ConcreteVisitorB implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println("ConcreteElementA 被 ConcreteVisitorB 访问");
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println("ConcreteElementB 被 ConcreteVisitorB 访问");
    }
}
