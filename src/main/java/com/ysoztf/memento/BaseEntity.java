package com.ysoztf.memento;

public class BaseEntity {
    private String param1;
    private int param2;
    private long param3;

    public MementoEntity generateMemento() {
        return new MementoEntity(param1, param2, param3);
    }

    public void loadMemento(MementoEntity mementoEntity) {
        this.param1 = mementoEntity.getParam1();
        this.param2 = mementoEntity.getParam2();
        this.param3 = mementoEntity.getParam3();
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public long getParam3() {
        return param3;
    }

    public void setParam3(long param3) {
        this.param3 = param3;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "param1='" + param1 + '\'' +
                ", param2=" + param2 +
                ", param3=" + param3 +
                '}';
    }
}
