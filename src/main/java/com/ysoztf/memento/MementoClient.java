package com.ysoztf.memento;

public class MementoClient {
    public static void main(String[] args) {
        BaseEntity baseEntity = new BaseEntity();
        baseEntity.setParam1("param1");
        baseEntity.setParam2(10);
        baseEntity.setParam3(1000L);
        System.out.println(baseEntity);
        MementoHolder mementoHolder = new MementoHolder();
        mementoHolder.setMemento(baseEntity.generateMemento());
        baseEntity.setParam1("param1_update");
        baseEntity.setParam2(-1);
        baseEntity.setParam3(-1001L);
        System.out.println(baseEntity);
        baseEntity.loadMemento(mementoHolder.getMemento());
        System.out.println(baseEntity);
    }
}
