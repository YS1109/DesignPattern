package com.ysoztf.template_method;

public class TemplateMethodClient {
    public static void main(String[] args) {
        EntityA entityA = new EntityA();
        EntityB entityB = new EntityB();

        entityA.doSomethingA();
        entityA.doSomethingB();
        entityA.doSomethingC();

        entityB.doSomethingA();
        entityB.doSomethingB();
        entityB.doSomethingC();

    }
}
