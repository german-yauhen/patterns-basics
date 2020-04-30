package com.herman.creation.abstractfactory.card;

import java.time.Month;
import java.time.Year;

public class MasterCardStandard extends Card {

    public MasterCardStandard() {}

    public MasterCardStandard(String holderName, Month validToMonth, int validToYear) {
        this.cardNumber = CardCodeNumberGenerator.generateCardNumber();
        this.scvNumber = CardCodeNumberGenerator.generateCardScv();
        this.holderName = holderName;
        this.validToMonth = validToMonth;
        this.validToYear = Year.of(validToYear);
        this.cardSystem = CardSystem.MASTERCARD;
        this.cardType = CardType.STANDARD;
    }
}
