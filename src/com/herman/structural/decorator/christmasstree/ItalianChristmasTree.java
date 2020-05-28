package com.herman.structural.decorator.christmasstree;

public class ItalianChristmasTree implements ChristmasTree {

    private static final String TITLE = "Italian Christmas Tree";
    private static final String GREETING = "Buongiorno!";

    @Override
    public String decorate() {
        return GREETING + " " + TITLE;
    }
}
