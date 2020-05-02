package com.herman.behavior.memento;

public interface Originator<T> {
    T save();
    void restore(T state);
}
