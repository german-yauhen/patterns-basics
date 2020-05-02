package com.herman.behavior.memento;

/**
 * Originator
 */
public class TextWindow implements Originator<TextWindowState> {
    private StringBuilder currentContent;

    public TextWindow() {
        currentContent = new StringBuilder();
    }

    public void addText(String text) {
        currentContent.append(text);
    }

    @Override
    public TextWindowState save() {
        return new TextWindowState(currentContent.toString());
    }

    @Override
    public void restore(TextWindowState windowState) {
        currentContent = new StringBuilder(windowState.getContent());
    }
}
