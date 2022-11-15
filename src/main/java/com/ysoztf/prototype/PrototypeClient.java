package com.ysoztf.prototype;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        OriginEntity originEntity = new OriginEntity();

        originEntity.setA(1);
        originEntity.setB("a");
        originEntity.setC(1.0);
        originEntity.setD(1);
        OriginEntityItem originEntityItem = new OriginEntityItem();
        originEntityItem.setA(1);
        originEntityItem.setB("a");
        originEntity.setE(originEntityItem);

        OriginEntity originEntity2 = (OriginEntity) originEntity.clone();
        originEntityItem.setA(2);

        System.out.println(originEntity2.getE().getA());

        //浅拷贝可以拷贝基础类型的封装类
        originEntity.setD(256);
        System.out.println(originEntity2.getD());


    }
}
