package com.ysoztf.singleton;

public class HungerSingleton {
    private HungerSingleton() {
    }

    private static class HungerSingletonHolder {
        private final static HungerSingleton hungerSingleton = new HungerSingleton();
    }

    public static HungerSingleton getInstance() {
        return HungerSingletonHolder.hungerSingleton;
    }
}
