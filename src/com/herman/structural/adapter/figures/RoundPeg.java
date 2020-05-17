package com.herman.structural.adapter.figures;

/**
 * RoundPeg is compatible with RoundHole.
 */
public class RoundPeg {

    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }

    public double getRadius() {
        return radius;
    }
}
