package com.coupon.application.utils;

import java.util.Random;

public class GenerateType {
    private static String[] couponTypes = {
            "Percentage Off", "Flat Discount", "Buy One Get One", "Free Shipping", "Cashback"
    };

    public static String generateRandomCouponType() {
        Random random = new Random();
        int randomIndex = random.nextInt(couponTypes.length);
        return couponTypes[randomIndex];
    }
}
