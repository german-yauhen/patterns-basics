package com.herman.behavior.strategy;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {

    private static final double DECREASED_COEFFICIENT = 0.5;

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(DECREASED_COEFFICIENT));
    }

}
