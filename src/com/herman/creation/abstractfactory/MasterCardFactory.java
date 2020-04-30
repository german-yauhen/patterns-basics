package com.herman.creation.abstractfactory;

import com.herman.creation.abstractfactory.card.Card;
import com.herman.creation.abstractfactory.card.CardType;
import com.herman.creation.abstractfactory.card.CreateCardRequest;
import com.herman.creation.abstractfactory.card.MasterCardGold;
import com.herman.creation.abstractfactory.card.MasterCardStandard;

import java.time.Month;
import java.util.NoSuchElementException;

public class MasterCardFactory extends CreditCardFactory {
    @Override
    protected Card getCard(CardType cardType, CreateCardRequest createCardRequest) {

        String cardHolderName = createCardRequest.getCardHolderName();
        Month expiredMonth = createCardRequest.getExpiredMonth();
        int expiredYear = createCardRequest.getExpiredYear();

        switch (cardType) {
            case GOLD:
                return new MasterCardGold(cardHolderName, expiredMonth, expiredYear);
            case STANDARD:
                return new MasterCardStandard(cardHolderName, expiredMonth, expiredYear);
            default:
                throw new NoSuchElementException("There are no available cards for specified type.");
        }
    }
}
