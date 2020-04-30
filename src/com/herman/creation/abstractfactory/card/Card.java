package com.herman.creation.abstractfactory.card;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.regex.Pattern;

public class Card {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
    private static final Pattern SCV_PATTERN = Pattern.compile("\\d{3}");

    protected String holderName;
    protected String cardNumber;
    protected Month validToMonth;
    protected Year validToYear;
    protected String scvNumber;

    protected CardSystem cardSystem;
    protected CardType cardType;

    public String getHolderName() {
        return holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Month getValidToMonth() {
        return validToMonth;
    }

    public Year getValidToYear() {
        return validToYear;
    }

    public String getScvNumber() {
        return scvNumber;
    }

    public String stringValidTo() {
        int monthNum = this.validToMonth.getValue();
        String monthNumStr = monthNum < 10 ? "0" + monthNum : String.valueOf(monthNum);
        return String.format("%s/%s", monthNumStr, this.validToYear.getValue());
    }

    public CardValidationResult validateCard() {
        CardValidationResult cardValidationResult = new CardValidationResult();
        cardValidationResult.setValidName(getHolderName() != null && !getHolderName().isEmpty());
        cardValidationResult.setValidNumber(getCardNumber() != null && NUMBER_PATTERN.matcher(getCardNumber()).matches());

        boolean isExpiredByYear = Year.now().isAfter(getValidToYear());
        cardValidationResult.setExpiredByYear(isExpiredByYear);

        cardValidationResult.setExpiredByMonth(
                !isExpiredByYear && (getValidToMonth().getValue() < LocalDate.now().getMonth().getValue())
        );

        cardValidationResult.setValidScv(
                getScvNumber() != null && SCV_PATTERN.matcher(getScvNumber()).matches()
        );
        return cardValidationResult;
    }

    @Override
    public String toString() {
        return String.format("%s::%s::%s::%s %s",
                this.holderName, this.cardNumber, stringValidTo(),
                this.cardSystem.toString(), this.cardType.toString());
    }
}