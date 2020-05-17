package com.herman.structural.adapter.speed;

public class AdapterRunner {
    public static void main(String[] args) {
        MPHMovable bugattiVeyron = new BugattiVeyron();
        double speedInKMPH = new MPHMovableAdapter(bugattiVeyron).getSpeed();
        System.out.println(speedInKMPH);
    }
}
