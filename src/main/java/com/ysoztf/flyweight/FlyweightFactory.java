package com.ysoztf.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap;

    public FlyweightFactory() {
        flyweightMap = new HashMap<>();
        flyweightMap.put("X", new ConcreteFlyweight());
        flyweightMap.put("Y", new ConcreteFlyweight());
        flyweightMap.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweightByKey(String key) {
        return flyweightMap.get(key);
    }
}
