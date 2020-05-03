package com.herman.behavior.state;

public class OrderedState<T> implements State<Parcel> {

    @Override
    public void next(Parcel parcel) {
        parcel.setParcelState(new DeliveredState<>());
    }

    @Override
    public void previous(Parcel parcel) {
        System.out.println("Warn! The parcel is in the initial state.");
    }

    @Override
    public void printState() {
        System.out.println("The parcel is in the ordered state.");
    }
}
