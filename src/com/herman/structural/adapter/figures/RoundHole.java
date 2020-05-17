package com.herman.structural.adapter.figures;

/**
 * RoundHole is compatible with RoundPeg.
 */
public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean doesFit(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
