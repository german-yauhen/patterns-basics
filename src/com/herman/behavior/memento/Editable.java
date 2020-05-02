package com.herman.behavior.memento;

public interface Editable<T> {
    void write(T content);
    T print();
}
