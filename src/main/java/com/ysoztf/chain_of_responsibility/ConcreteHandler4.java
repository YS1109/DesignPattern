package com.ysoztf.chain_of_responsibility;

/**
 * 责任链模式和状态模式非常像
 * 但是状态模式本质上是一个类对不同状态的多种不同响应
 * 责任链模式本质上是不同的类对同一个问题的响应
 * 状态模式的逻辑是在编译前就确定的，而责任链模式可以动态组装
 */
public class ConcreteHandler4 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if (request > 30) {
            System.out.println("ConcreteHandler4 处理请求");
        }
        else {
            successor.HandleRequest(request);
        }
    }
}
