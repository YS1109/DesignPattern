package com.ysoztf.bridge;

/**
 * 桥接模式的应用场景：
 * 1.当一个种类的对象（A）可以拥有多个另一种类（B）的多个对象时，类似于关系型数据库中的多对多的模型
 * 2.A可以通过通用的方法调用B
 * 3.A这个种类的具体实现类要定义一些自己的属性，B也类似
 */
public class BridgeClient {
    public static void main(String[] args) {
        RefinedAbstractionA refinedAbstractionA = new RefinedAbstractionA("RefinedAbstractionA");
        RefinedAbstractionB refinedAbstractionB = new RefinedAbstractionB();

        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        ConcreteImplementorB concreteImplementorB = new ConcreteImplementorB();

        refinedAbstractionA.setImplementor(concreteImplementorA);
        refinedAbstractionA.operation();
        refinedAbstractionA.setImplementor(concreteImplementorB);
        refinedAbstractionA.operation();

        refinedAbstractionB.setImplementor(concreteImplementorA);
        refinedAbstractionB.operation();
        refinedAbstractionB.setImplementor(concreteImplementorB);
        refinedAbstractionB.operation();
    }
}
