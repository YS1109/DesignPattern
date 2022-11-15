package com.ysoztf.template_method;

public abstract class AbstractTemplate {

    public void doSomethingA() {
        System.out.println("do something:" + getValueA());
    }
    public void doSomethingB() {
        System.out.println("do something:" + getValueB());
    }
    public void doSomethingC() {
        System.out.println("do something:" + getValueC());
    }

    protected abstract String getValueA();
    protected abstract String getValueB();
    protected abstract String getValueC();
}
