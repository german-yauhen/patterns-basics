package com.herman.structural.decorator.christmasstree;

public class TinselTreeDecorator extends ChristmasTreeDecorator {

    private static final String TITLE = "Tinsel decorative element";

    public TinselTreeDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with " + TITLE;
    }
}
