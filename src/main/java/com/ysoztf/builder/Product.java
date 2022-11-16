package com.ysoztf.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts;

    public Product() {
        parts = new ArrayList<>();
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public void showParts() {
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
