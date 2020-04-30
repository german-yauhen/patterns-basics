package com.herman.creation.abstractfactory;

import com.herman.creation.abstractfactory.card.Card;
import com.herman.creation.abstractfactory.card.CardSystem;
import com.herman.creation.abstractfactory.card.CardType;
import com.herman.creation.abstractfactory.card.CreateCardRequest;

import java.time.Month;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        CreditCardFactory masterCardFactory = CreditCardFactory.getCreditCardFactory(CardSystem.MASTERCARD);
        CreditCardFactory visaFactory = CreditCardFactory.getCreditCardFactory(CardSystem.VISA);

        CreateCardRequest cardRequestNotExired = CreateCardRequest.builder()
                .holderName("Yauheni Hermanovich")
                .expiredMonth(Month.DECEMBER)
                .expiredYear(2023)
                .build();

        CreateCardRequest cardRequestExpired = CreateCardRequest.builder()
                .holderName("Yauheni Hermanovich")
                .expiredMonth(Month.DECEMBER)
                .expiredYear(2019)
                .build();

        CreateCardRequest cardRequestExpiredByMonth = CreateCardRequest.builder()
                .holderName("Yauheni Hermanovich")
                .expiredMonth(Month.MARCH)
                .expiredYear(2020)
                .build();


        Card masterCardGold = masterCardFactory.getCard(CardType.GOLD, cardRequestNotExired);
        Card visaStandard = visaFactory.getCard(CardType.STANDARD, cardRequestExpired);
        Card masterCardStandard = masterCardFactory.getCard(CardType.STANDARD, cardRequestExpiredByMonth);

        System.out.println(masterCardGold);
        System.out.println(visaStandard);
        System.out.println(masterCardStandard);

        System.out.println(masterCardGold.validateCard().getValidationMessage());
        System.out.println(visaStandard.validateCard().getValidationMessage());
        System.out.println(masterCardStandard.validateCard().getValidationMessage());
    }
}
