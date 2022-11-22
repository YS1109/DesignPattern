package com.ysoztf.memento;

public class MementoEntity {
    private String param1;
    private int param2;
    private long param3;

    public MementoEntity(String param1, int param2, long param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public String getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public long getParam3() {
        return param3;
    }
}
