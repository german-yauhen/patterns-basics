package com.herman.behavior.chainofresponsibility.staff;

import com.herman.behavior.chainofresponsibility.request.Request;
import com.herman.behavior.chainofresponsibility.request.RequestType;

public class VP extends Handler {

    private static final double LIMIT_AMOUNT = 1000.0;

    @Override
    public void handleRequest(Request request) {
        RequestType requestType = request.getRequestType();
        if (RequestType.PURCHASE == requestType && request.getAmount() <= LIMIT_AMOUNT) {
            System.out.println(
                    String.format("VP approves %s since it has the amount up to %f", requestType, LIMIT_AMOUNT)
            );
        } else {
            successor.handleRequest(request);
        }
    }
}
