package com.herman.behavior.strategy;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

public interface Discounter extends UnaryOperator<BigDecimal> {

    default Discounter combine(Discounter after) {
        return amount -> after.apply(this.apply(amount));
    }
}
