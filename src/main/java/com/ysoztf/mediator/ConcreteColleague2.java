package com.ysoztf.mediator;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
       mediator.send(message, this);
    }

    public void receive(String message) {
        System.out.println("ConcreteColleague2 get message:" + message);
    }
}
