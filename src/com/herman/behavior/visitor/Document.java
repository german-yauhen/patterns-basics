package com.herman.behavior.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Document {

    private List<Element> elements;

    public Document() {
        this.elements = new ArrayList<>();
    }

    public List<Element> getElements() {
        return Collections.unmodifiableList(elements);
    }

    public void addElement(Element element) {
        elements.add(element);
    }
}
