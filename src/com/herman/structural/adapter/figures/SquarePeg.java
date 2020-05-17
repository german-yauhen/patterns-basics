package com.herman.structural.adapter.figures;

/**
 * Square peg is not compatible with RoundHole. But we have to integrate it into our application.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
