package com.ysoztf.visitor;

public class VisitorClient {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitorA concreteVisitorA = new ConcreteVisitorA();
        ConcreteVisitorB concreteVisitorB = new ConcreteVisitorB();

        o.accept(concreteVisitorA);
        o.accept(concreteVisitorB);
    }
}
