package com.coupon.application.utils;

import java.util.Random;

public class StatusGenerator {
    private static final String[] statuses = {"NEW", "REDEEMED", "EXPIRED"};

    public static String getStatus() {
        Random random = new Random();
        int randomIndex = random.nextInt(statuses.length);
        return statuses[randomIndex];
    }
}
