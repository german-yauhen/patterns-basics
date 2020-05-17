package com.herman.structural.adapter.speed;

public class BugattiVeyron implements MPHMovable {

    public static final double MAX_SPEED = 268.0;

    @Override
    public double getSpeed() {
        return MAX_SPEED;
    }
}
