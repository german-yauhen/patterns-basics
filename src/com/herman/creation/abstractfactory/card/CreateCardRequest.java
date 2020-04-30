package com.herman.creation.abstractfactory.card;

import java.time.Month;

public class CreateCardRequest {

    private String cardHolderName;
    private Month expiredMonth;
    private int expiredYear;

    private CreateCardRequest() {}

    public String getCardHolderName() {
        return cardHolderName;
    }

    public Month getExpiredMonth() {
        return expiredMonth;
    }

    public int getExpiredYear() {
        return expiredYear;
    }

    public static CreateCardRequestBuilder builder() {
        return new CreateCardRequestBuilder();
    }

    public final static class CreateCardRequestBuilder {
        private String cardHolderName;
        private Month expiredMonth;
        private int expiredYear;

        private CreateCardRequestBuilder() {}

        public CreateCardRequestBuilder holderName(String holderName) {
            this.cardHolderName = holderName;
            return this;
        }

        public CreateCardRequestBuilder expiredMonth(Month month) {
            this.expiredMonth = month;
            return this;
        }

        public CreateCardRequestBuilder expiredYear(int year) {
            this.expiredYear = year;
            return this;
        }

        public CreateCardRequest build() {
            CreateCardRequest createCardRequest = new CreateCardRequest();
            createCardRequest.cardHolderName = this.cardHolderName;
            createCardRequest.expiredMonth = this.expiredMonth;
            createCardRequest.expiredYear = this.expiredYear;
            return createCardRequest;
        }
    }

}
