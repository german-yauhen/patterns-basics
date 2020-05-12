package com.herman.behavior.strategy;

import java.math.BigDecimal;

public class DiscountRunner {
    public static void main(String[] args) {
        BigDecimal amount = BigDecimal.TEN;
        Discounter easterDiscounter = new EasterDiscounter();
        Discounter christmasDiscounter = new ChristmasDiscounter();

        System.out.println("Easter amount: " + easterDiscounter.apply(amount));
        System.out.println("Christmas amount: " + christmasDiscounter.apply(amount));

        DiscountStorage discountStorage = new DiscountStorage();
        discountStorage.registerDiscount("EASTER", easterDiscounter);
        discountStorage.registerDiscount("CHRISTMAS", christmasDiscounter);

        Discounter combinedDiscounter = discountStorage.getAllDiscounters().stream()
                .reduce(discounter -> discounter, Discounter::combine);
        BigDecimal processedValue = combinedDiscounter.apply(amount);

        System.out.println("Processed value through all discounters: " + processedValue);
    }
}
