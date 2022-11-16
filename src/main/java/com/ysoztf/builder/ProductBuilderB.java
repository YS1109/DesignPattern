package com.ysoztf.builder;

public class ProductBuilderB implements ProductBuilderInterface{
    private Product product;

    public ProductBuilderB() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("builderB's partA");
    }

    @Override
    public void buildPartB() {
        product.addPart("builderB's partB");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
