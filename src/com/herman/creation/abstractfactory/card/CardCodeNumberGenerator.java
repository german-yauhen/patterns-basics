package com.herman.creation.abstractfactory.card;

import java.util.Random;

public class CardCodeNumberGenerator {

    private static final int CARD_NUMBER_PARTIAL_BOUND = 10000;

    // TODO: use ThreadLocalRandom to aware of contention and consequent poor performance
    private static final Random RANDOM_NUMBER = new Random();

    private static final int CARD_SCV_BOUND = 1000;
    // TODO: use ThreadLocalRandom to aware of contention and consequent poor performance
    private static final Random RANDOM_SCV = new Random();


    public static String generateCardNumber() {
        return String.format("%04d-%04d-%04d-%04d",
                RANDOM_NUMBER.nextInt(CARD_NUMBER_PARTIAL_BOUND),
                RANDOM_NUMBER.nextInt(CARD_NUMBER_PARTIAL_BOUND),
                RANDOM_NUMBER.nextInt(CARD_NUMBER_PARTIAL_BOUND),
                RANDOM_NUMBER.nextInt(CARD_NUMBER_PARTIAL_BOUND)
        );
    }

    public static String generateCardScv() {
        return String.format("%03d", RANDOM_SCV.nextInt(CARD_SCV_BOUND));
    }
}
