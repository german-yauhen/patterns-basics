package com.herman.creation.abstractfactory.card;

import java.time.Month;
import java.time.Year;

public class VisaGold extends Card {

    public VisaGold() {
    }

    public VisaGold(String holderName, Month validToMonth, int validToYear) {
        this.cardNumber = CardCodeNumberGenerator.generateCardNumber();
        this.scvNumber = CardCodeNumberGenerator.generateCardScv();
        this.holderName = holderName;
        this.validToMonth = validToMonth;
        this.validToYear = Year.of(validToYear);
        this.cardSystem = CardSystem.VISA;
        this.cardType = CardType.GOLD;
    }

}
