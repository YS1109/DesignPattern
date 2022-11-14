package com.ysoztf.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        OriginEntity originEntity = new OriginEntity();
        EntityDecoratorA entityDecoratorA = new EntityDecoratorA();
        EntityDecoratorB entityDecoratorB = new EntityDecoratorB();

        entityDecoratorA.setAbstractEntity(originEntity);
        entityDecoratorB.setAbstractEntity(entityDecoratorA);

        originEntity.doSomething();
        System.out.println("------------------");
        entityDecoratorA.doSomething();
        System.out.println("------------------");
        entityDecoratorB.doSomething();
    }
}
