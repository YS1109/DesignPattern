package com.ysoztf.observer;

import java.util.Vector;

public abstract class Subject {

    public Vector<Observer> getObservers() {
        return observers;
    }

    public void setObservers(Vector<Observer> observers) {
        this.observers = observers;
    }

    private Vector<Observer> observers = new Vector<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}
