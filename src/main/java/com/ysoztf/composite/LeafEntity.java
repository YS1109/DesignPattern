package com.ysoztf.composite;

import java.util.Vector;

public class LeafEntity extends CommonEntity{

    public LeafEntity(String name) {
        super(name);
    }

    @Override
    public Vector<CommonEntity> getChildren() {
        return null;
    }

    @Override
    public void add(CommonEntity commonEntity) {
        System.out.println("leafEntity doesn't have children");
    }

    @Override
    public void remove(CommonEntity commonEntity) {
        System.out.println("leafEntity doesn't have children");
    }

    @Override
    public void showChildren(int depth) {
        for (int i = depth; i > 0; i--) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name + " do something");
    }
}
