package com.ysoztf.observer;

public class SubjectOne extends Subject{
    public void updateSubjectStatus(String status) {
        System.out.println("subjectOne update Status");
        notifyObservers(status);
    }
}
