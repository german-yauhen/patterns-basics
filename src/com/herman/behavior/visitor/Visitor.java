package com.herman.behavior.visitor;

public interface Visitor {

    void processXml(XmlElement xmlElement);
    void processJson(JsonElement jsonElement);

}
