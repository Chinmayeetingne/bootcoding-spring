package com.coupon.application.utils;

import java.util.Random;

public class GenerateCouponTitle {
    private static String[] words = {"Special", "Discount", "Promotion", "Exclusive", "Limited", "Offer", "Deal"};

    public static String generateRandomCouponTitle() {
        Random random = new Random();
        StringBuilder titleBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++) { // Generate a title with three words
            int randomIndex = random.nextInt(words.length);
            titleBuilder.append(words[randomIndex]).append(" ");
        }

        return titleBuilder.toString().trim();
    }
}
