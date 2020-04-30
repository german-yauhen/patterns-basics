package com.herman.behavior.chainofresponsibility.staff;

import com.herman.behavior.chainofresponsibility.request.Request;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
