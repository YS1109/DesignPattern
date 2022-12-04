package com.ysoztf.visitor;

import java.util.Vector;

public class ObjectStructure {
    private Vector<Element> elements = new Vector<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
