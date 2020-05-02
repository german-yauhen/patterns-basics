package com.herman.behavior.memento;

/**
 * Memento
 */
public class TextWindowState {
    private String windowContent;

    public TextWindowState(String windowContent) {
        this.windowContent = windowContent;
    }

    public String getContent() {
        return windowContent;
    }
}
