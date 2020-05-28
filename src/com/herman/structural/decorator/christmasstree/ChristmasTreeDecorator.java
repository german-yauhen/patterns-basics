package com.herman.structural.decorator.christmasstree;

/**
 * Decorator
 */
public abstract class ChristmasTreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public ChristmasTreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return this.christmasTree.decorate();
    }
}
