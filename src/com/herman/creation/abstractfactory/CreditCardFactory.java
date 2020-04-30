package com.herman.creation.abstractfactory;

import com.herman.creation.abstractfactory.card.Card;
import com.herman.creation.abstractfactory.card.CardSystem;
import com.herman.creation.abstractfactory.card.CardType;
import com.herman.creation.abstractfactory.card.CreateCardRequest;

import java.time.Month;
import java.time.Year;
import java.util.NoSuchElementException;

public abstract class CreditCardFactory implements CreateCardRequestValidator {

    public static CreditCardFactory getCreditCardFactory(CardSystem cardSystem) {
        switch (cardSystem) {
            case VISA:
                return new VisaCardFactory();
            case MASTERCARD:
                return new MasterCardFactory();
            default: throw new NoSuchElementException("There are no card vendors for specified conditions.");
        }
    }

    protected abstract Card getCard(CardType cardType, CreateCardRequest createCardRequest);

    @Override
    public boolean isValidRequest(CreateCardRequest createCardRequest) {
        String cardHolderName = createCardRequest.getCardHolderName();
        if (cardHolderName == null || cardHolderName.isEmpty()) {
            return false;
        }

        Month expiredMonth = createCardRequest.getExpiredMonth();
        if (expiredMonth == null) {
            return false;
        }

        if (Year.now().isAfter(Year.of(createCardRequest.getExpiredYear()))) {
            return false;
        }

        return true;
    }

}
