package com.ysoztf.chain_of_responsibility;

public class ConcreteHandler3 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if (request >= 15 && request < 30) {
            System.out.println("ConcreteHandler3 处理请求");
        }
        else {
            successor.HandleRequest(request);
        }
    }
}
