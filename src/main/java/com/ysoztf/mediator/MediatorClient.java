package com.ysoztf.mediator;

public class MediatorClient {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediator);

        concreteMediator.setConcreteColleague1(concreteColleague1);
        concreteMediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.send("ConcreteColleague1's message");
        concreteColleague2.send("ConcreteColleague2's message");
    }
}
