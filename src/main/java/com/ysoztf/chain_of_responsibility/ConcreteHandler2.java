package com.ysoztf.chain_of_responsibility;

public class ConcreteHandler2 extends Handler{

    @Override
    public void HandleRequest(int request) {
        if (request >= 0 && request < 15) {
            System.out.println("ConcreteHandler2 处理请求");
        }
        else {
            successor.HandleRequest(request);
        }
    }
}
