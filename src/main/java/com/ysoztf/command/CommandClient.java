package com.ysoztf.command;

/**
 * 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开，解耦合。这样两者之间通过命令对象进行沟通，这样方便将命令对象进行存储、传递、调用、增加与管理。
 */
public class CommandClient {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);

        invoker.executeCommand();
    }
}
