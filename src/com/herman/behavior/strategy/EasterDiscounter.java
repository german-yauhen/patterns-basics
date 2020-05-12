package com.herman.behavior.strategy;

import java.math.BigDecimal;

public class EasterDiscounter implements Discounter {

    private static final double DECREASED_COEFFICIENT = 0.9;

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(DECREASED_COEFFICIENT));
    }
}
