package com.herman.behavior.visitor;

public class XmlElement extends Element {

    public XmlElement(String uuid, String content) {
        super(uuid, content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.processXml(this);
    }

}