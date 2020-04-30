package com.herman.creation.abstractfactory.card;

import java.time.Month;
import java.time.Year;

public class VisaStandard extends Card {

    public VisaStandard() {
    }

    public VisaStandard(String holderName, Month validToMonth, int validToYear) {
        this.cardNumber = CardCodeNumberGenerator.generateCardNumber();
        this.scvNumber = CardCodeNumberGenerator.generateCardScv();
        this.holderName = holderName;
        this.validToMonth = validToMonth;
        this.validToYear = Year.of(validToYear);
        this.cardSystem = CardSystem.VISA;
        this.cardType = CardType.STANDARD;
    }

}
