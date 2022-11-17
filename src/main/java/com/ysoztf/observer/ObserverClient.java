package com.ysoztf.observer;

/**
 * 观察者模式其实用通俗的话来讲，就是一种订阅+通知的模式。
 * 其中Subject的notify方法可以把自身传过去，并在Subject中定义通用的变量，这样可以便于Observer取值，但是会增加耦合性
 * 也可以定在抽象类中定义不同的通用的notify方法，这样不用传参，适合Observer接到通知后去做一些不需要参数就能完成的操作
 */
public class ObserverClient {
    public static void main(String[] args) {
        SubjectOne subjectOne = new SubjectOne();
        SubjectTwo subjectTwo = new SubjectTwo();

        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();

        subjectOne.add(observerOne);
        subjectOne.add(observerTwo);
        subjectOne.updateSubjectStatus("status1");
        subjectOne.remove(observerOne);
        subjectOne.updateSubjectStatus("status2");

        subjectTwo.add(observerOne);
        subjectTwo.add(observerTwo);
        subjectTwo.updateSubjectStatus("status1");
        subjectTwo.remove(observerTwo);
        subjectTwo.updateSubjectStatus("status2");
    }
}
