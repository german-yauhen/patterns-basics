package com.herman.behavior.chainofresponsibility;

import com.herman.behavior.chainofresponsibility.request.Request;
import com.herman.behavior.chainofresponsibility.request.RequestType;
import com.herman.behavior.chainofresponsibility.staff.CEO;
import com.herman.behavior.chainofresponsibility.staff.Director;
import com.herman.behavior.chainofresponsibility.staff.VP;

public class ChainResponsibilityRunner {

    public static void main(String[] args) {
        CEO ceo = new CEO();

        VP vp = new VP();
        vp.setSuccessor(ceo);

        Director director = new Director();
        director.setSuccessor(vp);

        Request purchaseRequest = new Request(RequestType.PURCHASE, 750.0);
        Request conferenceRequest = new Request(RequestType.CONFERENCE, 750.0);
        Request purchaseRequestSecond = new Request(RequestType.PURCHASE, 10000.0);

        director.handleRequest(purchaseRequest);
        director.handleRequest(conferenceRequest);
        director.handleRequest(purchaseRequestSecond);
    }

}
