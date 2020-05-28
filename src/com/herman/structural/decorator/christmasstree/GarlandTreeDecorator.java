package com.herman.structural.decorator.christmasstree;

public class GarlandTreeDecorator extends ChristmasTreeDecorator {

    private static final String TITLE = "Garland decorative element";

    public GarlandTreeDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with " + TITLE;
    }
}
