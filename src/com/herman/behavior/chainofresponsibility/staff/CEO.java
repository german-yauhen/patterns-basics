package com.herman.behavior.chainofresponsibility.staff;

import com.herman.behavior.chainofresponsibility.request.Request;

public class CEO extends Handler {

    private static final double LIMIT_AMOUNT = 10000.0;

    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() <= LIMIT_AMOUNT) {
            System.out.println(
                    String.format("CEO approves %s since it has the amount up to %f",
                            request.getRequestType(), LIMIT_AMOUNT)
            );
        } else {
            System.out.println(
                    String.format("We can not proceed with an amount greater than %s. Please, contact to our manager.",
                            LIMIT_AMOUNT)
            );
        }

    }
}
