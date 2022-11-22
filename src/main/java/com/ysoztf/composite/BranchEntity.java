package com.ysoztf.composite;

import java.util.Vector;

public class BranchEntity extends CommonEntity{
    private Vector<CommonEntity> commonEntities;

    public BranchEntity(String name) {
        super(name);
        commonEntities = new Vector<>();
    }

    @Override
    public Vector<CommonEntity> getChildren() {
        return commonEntities;
    }

    @Override
    public void add(CommonEntity commonEntity) {
        commonEntities.add(commonEntity);
    }

    @Override
    public void remove(CommonEntity commonEntity) {
        commonEntity.remove(commonEntity);
    }

    @Override
    public void showChildren(int depth) {
        if (depth <= 0) {
            return;
        }
        for (int i = depth; i > 0; i--) {
            System.out.print("-");
        }
        System.out.println(name);
        for (CommonEntity commonEntity : commonEntities) {
            commonEntity.showChildren(depth - 1);
        }
    }

    @Override
    public void doSomething() {
        System.out.println(name + " do something");
        for (CommonEntity commonEntity : commonEntities) {
            commonEntity.doSomething();
        }
    }
}
