package com.ysoztf.template_method;

public class EntityB extends AbstractTemplate{
    @Override
    protected String getValueA() {
        return "entityB's valueA";
    }

    @Override
    protected String getValueB() {
        return "entityB's valueB";
    }

    @Override
    protected String getValueC() {
        return "entityB's valueC";
    }
}
