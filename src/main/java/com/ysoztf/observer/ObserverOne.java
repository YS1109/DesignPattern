package com.ysoztf.observer;

public class ObserverOne implements Observer{
    @Override
    public void update(String status) {
        System.out.println("observerOne received status:" + status);
    }
}
