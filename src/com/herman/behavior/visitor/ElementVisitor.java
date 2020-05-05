package com.herman.behavior.visitor;

public class ElementVisitor implements Visitor {

    @Override
    public void processXml(XmlElement xmlElement) {
        System.out.println("Looking through XML document...");
        System.out.println(xmlElement.getUuid());
        System.out.println(xmlElement.getContent());
    }

    @Override
    public void processJson(JsonElement jsonElement) {
        System.out.println("Looking through JSON document...");
        System.out.println(jsonElement.getUuid());
        System.out.println(jsonElement.getContent());
    }

}
