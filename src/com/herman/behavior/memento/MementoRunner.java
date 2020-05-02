package com.herman.behavior.memento;

public class MementoRunner {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("First row\n");
        textEditor.write("Second row\n");
        textEditor.write("Row before saved\n");

        textEditor.doSave();

        textEditor.write("Fourth row\n");

        textEditor.doRestore();

        System.out.println(textEditor.print());

    }
}
