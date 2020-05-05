package com.herman.behavior.visitor;

import java.util.UUID;

public class VisitorRunner {
    public static void main(String[] args) {
        Document document = new Document();
        Element xml = new XmlElement(UUID.randomUUID().toString(), "{\"status\":\"200\"}");
        Element json = new JsonElement(UUID.randomUUID().toString(), "<document><status>404</status></document>");

        document.addElement(xml);
        document.addElement(json);

        ElementVisitor elementVisitor = new ElementVisitor();

        document.getElements()
                .forEach(element -> element.accept(elementVisitor));
    }
}
