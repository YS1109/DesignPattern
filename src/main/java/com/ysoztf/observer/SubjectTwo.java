package com.ysoztf.observer;

public class SubjectTwo extends Subject{
    public void updateSubjectStatus(String status) {
        System.out.println("subjectTwo update Status");
        notifyObservers(status);
    }
}
