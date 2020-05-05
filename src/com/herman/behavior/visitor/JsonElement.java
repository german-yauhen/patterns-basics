package com.herman.behavior.visitor;

public class JsonElement extends Element {

    public JsonElement(String uuid, String content) {
        super(uuid, content);
    }

    @Override
    protected void accept(Visitor visitor) {
        visitor.processJson(this);
    }

}
