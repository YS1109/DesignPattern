package com.ysoztf.builder;

public class ProductBuilderA implements ProductBuilderInterface{
    private Product product;

    public ProductBuilderA() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("builderA's partA");
    }

    @Override
    public void buildPartB() {
        product.addPart("builderA's partB");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
