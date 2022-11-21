package com.ysoztf.status;

/**
 * 状态模式可以用于当一个场景需要对一个或者一组值进行判断，选择不同的处理逻辑时
 * 这样做的好处是便于扩展，每个处理逻辑都可以是单独的一个类，层次分明，扩展时不需要在原来的类中改变，只需要将新的逻辑类插入到处理的链条中
 * 坏处是会增加内存开销
 */
public class StatusClient {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setValue(-10);
        entity.writeCurrentState();
        entity.setValue(1);
        entity.writeCurrentState();
        entity.setValue(20);
        entity.writeCurrentState();
    }
}
