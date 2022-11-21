package com.ysoztf.adapter;

/**
 * 如果两个类做的事情相同或相似，并且都不太容易修改，但是具有不同的接口的时，可以考虑使用适配器模式
 * 适配器模式一般用于后期项目维护的时候
 */
public class AdapterClient {
    public static void main(String[] args) {
        TargetEntity targetEntity = new TargetEntity();
        SpecialEntity specialEntity = new SpecialEntity();

        TargetEntity adapter = new Adapter(specialEntity);

        targetEntity.request();
        adapter.request();
    }
}
