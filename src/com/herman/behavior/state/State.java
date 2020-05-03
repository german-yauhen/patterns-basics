package com.herman.behavior.state;

public interface State<T> {

    void next(T context);
    void previous(T context);
    void printState();

}
