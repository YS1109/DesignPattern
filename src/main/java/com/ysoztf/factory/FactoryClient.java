package com.ysoztf.factory;

public class FactoryClient {
    public static void main(String[] args) {
        CommonEntityFactory commonEntityFactory = new CommonEntityFactory();
        commonEntityFactory.createCommonEntity().doSomethingOfCommon();

        CommonEntityAFactory commonEntityAFactory = new CommonEntityAFactory();
        commonEntityAFactory.createCommonEntity().doSomethingOfCommon();

        CommonEntityBFactory commonEntityBFactory = new CommonEntityBFactory();
        commonEntityBFactory.createCommonEntity().doSomethingOfCommon();
    }
}
