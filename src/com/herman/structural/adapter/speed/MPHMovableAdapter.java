package com.herman.structural.adapter.speed;

public class MPHMovableAdapter implements KMPHMovable {

    public static final double MILLES_TO_KM_KOEFFICIENT = 1.60934;

    private MPHMovable mphMovable;

    public MPHMovableAdapter(MPHMovable mphMovable) {
        this.mphMovable = mphMovable;
    }

    @Override
    public double getSpeed() {
        return mphMovable.getSpeed() * MILLES_TO_KM_KOEFFICIENT;
    }
}
