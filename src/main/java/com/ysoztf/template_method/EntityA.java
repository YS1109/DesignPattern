package com.ysoztf.template_method;

public class EntityA extends AbstractTemplate{
    @Override
    protected String getValueA() {
        return "entityA's valueA";
    }

    @Override
    protected String getValueB() {
        return "entityA's valueB";
    }

    @Override
    protected String getValueC() {
        return "entityA's valueC";
    }
}
