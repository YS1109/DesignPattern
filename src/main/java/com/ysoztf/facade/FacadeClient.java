package com.ysoztf.facade;

public class FacadeClient {
    //dao、service、controller是典型的这种结构，遵循迪米特法则进行解耦
    public static void main(String[] args) {
        FacadeEntity facadeEntity = new FacadeEntity();
        facadeEntity.methodA();
        System.out.println("-------------");
        facadeEntity.methodB();
        System.out.println("-------------");
        facadeEntity.methodC();
    }
}
