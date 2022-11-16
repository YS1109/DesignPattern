package com.ysoztf.builder;

public class BuilderClient {
    public static void main(String[] args) {
        ProductBuilderA productBuilderA = new ProductBuilderA();
        ProductBuilderB productBuilderB = new ProductBuilderB();

        productBuilderA.buildPartA();
        productBuilderA.buildPartB();
        productBuilderA.getProduct().showParts();

        System.out.println("-----------------------");

        productBuilderB.buildPartA();
        productBuilderB.buildPartB();
        productBuilderB.getProduct().showParts();
    }
}
