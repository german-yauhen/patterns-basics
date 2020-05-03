package com.herman.behavior.state;

public class StateRunner {
    public static void main(String[] args) {
        Parcel parcel = new Parcel();
        parcel.printState();

        parcel.previousState();

        parcel.nextState();
        parcel.printState();

        parcel.previousState();
        parcel.printState();

        parcel.nextState();
        parcel.printState();

        parcel.nextState();
        parcel.printState();

        parcel.nextState();
        parcel.printState();
    }
}
