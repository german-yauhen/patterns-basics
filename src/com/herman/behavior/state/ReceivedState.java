package com.herman.behavior.state;

public class ReceivedState<T> implements State<Parcel> {

    @Override
    public void next(Parcel parcel) {
        System.out.println("Warn! The parcel is already received by a client.");
    }

    @Override
    public void previous(Parcel parcel) {
        parcel.setParcelState(new DeliveredState<>());
    }

    @Override
    public void printState() {
        System.out.println("The parcel is received by a client.");
    }
}
