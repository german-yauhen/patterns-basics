package com.herman.behavior.visitor;

public abstract class Element {

    private String uuid;
    private String content;

    protected Element(String uuid, String content) {
        this.uuid = uuid;
        this.content = content;
    }

    protected abstract void accept(Visitor visitor);

    public String getContent() {
        return content;
    }

    public String getUuid() {
        return uuid;
    }
}
