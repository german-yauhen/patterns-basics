package com.herman.behavior.strategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountStorage {
    private Map<String, Discounter> discounts = new HashMap<>();

    public Discounter getDiscount(String discountName) {
        return discounts.getOrDefault(discountName, amount -> amount);
    }

    public void registerDiscount(String discountName, Discounter discounter) {
        discounts.put(discountName, discounter);
    }

    public List<Discounter> getAllDiscounters() {
        return new ArrayList<>(discounts.values());
    }
}
