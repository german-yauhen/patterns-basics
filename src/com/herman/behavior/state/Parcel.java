package com.herman.behavior.state;

public class Parcel {

    private State<Parcel> parcelState;

    public Parcel() {
        parcelState = new OrderedState<>();
    }

    void nextState() {
        parcelState.next(this);
    }

    void previousState() {
        parcelState.previous(this);
    }

    void printState() {
        parcelState.printState();
    }

    public void setParcelState(State<Parcel> parcelState) {
        this.parcelState = parcelState;
    }

}
