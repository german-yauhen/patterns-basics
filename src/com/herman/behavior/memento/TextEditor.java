package com.herman.behavior.memento;

/**
 * Caretaker
 */
public class TextEditor implements Editable<String> {

    private TextWindow textWindow;
    private TextWindowState windowState;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void doSave() {
        this.windowState = textWindow.save();
    }

    /**
     * Undo operation
     */
    public void doRestore() {
        textWindow.restore(windowState);
    }

    @Override
    public void write(String text) {
        textWindow.addText(text);
    }

    @Override
    public String print() {
        return windowState.getContent();
    }
}
