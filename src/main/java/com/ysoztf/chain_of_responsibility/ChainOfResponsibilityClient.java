package com.ysoztf.chain_of_responsibility;

import java.util.Random;

public class ChainOfResponsibilityClient {
    public static void main(String[] args) {
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();
        Handler concreteHandler3 = new ConcreteHandler3();
        Handler concreteHandler4 = new ConcreteHandler4();

        concreteHandler1.setSuccessor(concreteHandler2);
        concreteHandler2.setSuccessor(concreteHandler3);
        concreteHandler3.setSuccessor(concreteHandler4);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int request = random.nextInt(60) - 15;
            System.out.println("request=" + request);
            concreteHandler1.HandleRequest(request);
        }
    }
}
