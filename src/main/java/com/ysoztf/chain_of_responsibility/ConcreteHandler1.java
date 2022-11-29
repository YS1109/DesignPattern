package com.ysoztf.chain_of_responsibility;

public class ConcreteHandler1 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if (request < 0) {
            System.out.println("ConcreteHandler1 处理请求");
        }
        else {
            successor.HandleRequest(request);
        }
    }
}
