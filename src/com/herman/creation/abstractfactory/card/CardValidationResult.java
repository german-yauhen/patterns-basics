package com.herman.creation.abstractfactory.card;

import java.util.ArrayList;
import java.util.List;

public class CardValidationResult {

    private boolean isValidName;
    private boolean isValidNumber;
    private boolean isExpiredByYear;
    private boolean isExpiredByMonth;

    public boolean isValidScv() {
        return isValidScv;
    }

    public void setValidScv(boolean validScv) {
        isValidScv = validScv;
    }

    private boolean isValidScv;

    public CardValidationResult() {
    }

    public boolean isValidName() {
        return isValidName;
    }

    public void setValidName(boolean validName) {
        isValidName = validName;
    }

    public boolean isValidNumber() {
        return isValidNumber;
    }

    public void setValidNumber(boolean validNumber) {
        isValidNumber = validNumber;
    }

    public boolean isExpiredByYear() {
        return isExpiredByYear;
    }

    public void setExpiredByYear(boolean expiredByYear) {
        isExpiredByYear = expiredByYear;
    }

    public boolean isExpiredByMonth() {
        return isExpiredByMonth;
    }

    public void setExpiredByMonth(boolean expiredByMonth) {
        isExpiredByMonth = expiredByMonth;
    }

    public String getValidationMessage() {
        if (isValidName && isValidNumber && !isExpiredByYear() && !isExpiredByMonth()) {
            return "Congrats! Card is valid.";
        }

        List<String> messages = new ArrayList<>();

        if (!isValidName) {
            messages.add("Not valid name.");
        }

        if (!isValidNumber) {
            messages.add("Not valid number.");
        }

        if (!isValidScv) {
            messages.add("Not valid scv code.");
        }

        if (isExpiredByYear) {
            messages.add("Card is expired by year.");
        }

        if (isExpiredByMonth) {
            messages.add("Card is expired by month.");
        }
        return String.join(" ", messages);
    }
}
