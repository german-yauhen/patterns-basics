package com.herman.structural.decorator.christmasstree;

public class BelarussianChristmasTree implements ChristmasTree {

    private static final String TITLE = "Belarussian Christmas Tree";

    @Override
    public String decorate() {
        return TITLE;
    }
}
