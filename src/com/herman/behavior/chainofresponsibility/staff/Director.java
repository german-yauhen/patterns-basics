package com.herman.behavior.chainofresponsibility.staff;

import com.herman.behavior.chainofresponsibility.request.Request;
import com.herman.behavior.chainofresponsibility.request.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        RequestType requestType = request.getRequestType();
        if (RequestType.CONFERENCE == requestType) {
            System.out.println("Director approves the " + requestType);
        } else {
            successor.handleRequest(request);
        }
    }
}
