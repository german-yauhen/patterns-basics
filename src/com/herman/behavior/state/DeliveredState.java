package com.herman.behavior.state;

public class DeliveredState<T> implements State<Parcel> {

    @Override
    public void next(Parcel parcel) {
        parcel.setParcelState(new ReceivedState<>());
    }

    @Override
    public void previous(Parcel parcel) {
        parcel.setParcelState(new OrderedState<>());
    }

    @Override
    public void printState() {
        System.out.println("The parcel delivered to post office. Not received yet.");
    }
}
