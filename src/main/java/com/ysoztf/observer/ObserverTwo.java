package com.ysoztf.observer;

public class ObserverTwo implements Observer{
    @Override
    public void update(String status) {
        System.out.println("observerTwo received status:" + status);
    }
}
