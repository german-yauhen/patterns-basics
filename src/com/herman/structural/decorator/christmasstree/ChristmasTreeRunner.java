package com.herman.structural.decorator.christmasstree;

public class ChristmasTreeRunner {
    public static void main(String[] args) {
        ChristmasTree belChristmasTree = new BelarussianChristmasTree();
        ChristmasTreeDecorator garlandDecorator = new GarlandTreeDecorator(belChristmasTree);
        System.out.println(garlandDecorator.decorate());

        ChristmasTree itaChristmasTree = new ItalianChristmasTree();
        ChristmasTreeDecorator tinselDecorator = new TinselTreeDecorator(itaChristmasTree);
        System.out.println(tinselDecorator.decorate());
    }
}
